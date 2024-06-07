package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.BusStop;
import model.Date;
import model.Route;
import model.SpecialEvent;

public class BusService {
    private List<BusStop> busStopList;
    // 5 boxes: date, busName, busNum, time, description // sua lai complaintBoxDAO
    private static List<String[]> complaintBoxList = ComplaintBoxDAO.loadListFromFileChar("ComplaintBox.txt");
    private Map<String, List<BusStop>> availabilityMap;
    private static List<SpecialEvent> specialEventList;

    public BusService() {
        this.busStopList = new ArrayList<>();
        // Initialize Bus Stop
        busStopList.add(new BusStop("University", 0));
        busStopList.add(new BusStop("Library", 1));
        busStopList.add(new BusStop("Sport Community", 2));
        busStopList.add(new BusStop("Dormitory", 3));
        busStopList.add(new BusStop("Airport", 4));

        // Add adjacentRoute
        this.busStopList.get(0).getAdjacentBusStopList().add(new Route(1, this.busStopList.get(1)));
        this.busStopList.get(0).getAdjacentBusStopList().add(new Route(4, this.busStopList.get(3)));
        this.busStopList.get(1).getAdjacentBusStopList().add(new Route(1, this.busStopList.get(0)));
        this.busStopList.get(1).getAdjacentBusStopList().add(new Route(2, this.busStopList.get(2)));
        this.busStopList.get(2).getAdjacentBusStopList().add(new Route(3, this.busStopList.get(3)));
        this.busStopList.get(3).getAdjacentBusStopList().add(new Route(4, this.busStopList.get(0)));
        this.busStopList.get(3).getAdjacentBusStopList().add(new Route(3, this.busStopList.get(2)));
        this.busStopList.get(3).getAdjacentBusStopList().add(new Route(5, this.busStopList.get(4)));
        this.busStopList.get(4).getAdjacentBusStopList().add(new Route(5, this.busStopList.get(3)));

        // Add associatedRoutes
        this.getBusStopList().get(0).getAssociatedRouteList().add(1);
        this.getBusStopList().get(0).getAssociatedRouteList().add(4);
        this.getBusStopList().get(1).getAssociatedRouteList().add(1);
        this.getBusStopList().get(1).getAssociatedRouteList().add(2);
        this.getBusStopList().get(2).getAssociatedRouteList().add(3);
        this.getBusStopList().get(3).getAssociatedRouteList().add(3);
        this.getBusStopList().get(3).getAssociatedRouteList().add(4);
        this.getBusStopList().get(3).getAssociatedRouteList().add(5);
        this.getBusStopList().get(4).getAssociatedRouteList().add(5);

        // Add departure time
        String[] s1 = { "8:30", "14:30" };
        this.getBusStopList().get(0).getDepartureTimeOfEachRoute().put(1, s1);
        String[] s2 = { "11:30", "16:30" };
        this.getBusStopList().get(0).getDepartureTimeOfEachRoute().put(4, s2);

        String[] s3 = { "11:20", "16:20" };
        this.getBusStopList().get(1).getDepartureTimeOfEachRoute().put(1, s3);
        String[] s4 = { "17:00" };
        this.getBusStopList().get(1).getDepartureTimeOfEachRoute().put(2, s4);

        String[] s5 = { "18:30" };
        this.getBusStopList().get(2).getDepartureTimeOfEachRoute().put(3, s5);

        String[] s6 = { "7:00", "12:00" };
        this.getBusStopList().get(3).getDepartureTimeOfEachRoute().put(4, s6);
        String[] s7 = { "17:00" };
        this.getBusStopList().get(3).getDepartureTimeOfEachRoute().put(3, s7);
        String[] s8 = { "8:30", "16:30" };
        this.getBusStopList().get(3).getDepartureTimeOfEachRoute().put(5, s8);

        String[] s9 = { "10:00", "15:30" };
        this.getBusStopList().get(4).getDepartureTimeOfEachRoute().put(5, s9);

        // Available ????????????????????????????????????????????????????
        // Special Event list
        BusStop[] pickupAndDropLocation = { busStopList.get(3), busStopList.get(4) };
        specialEventList.add(new SpecialEvent("New Year", new Date(1, 1, 2025), pickupAndDropLocation, 5));
        specialEventList.add(new SpecialEvent("Independence Day", new Date(2, 9, 2024), pickupAndDropLocation, 5));
        specialEventList.add(new SpecialEvent("Reunification Day", new Date(30, 4, 2025), pickupAndDropLocation, 5));
        specialEventList.add(new SpecialEvent("Merry Christmas", new Date(25, 12, 2024), pickupAndDropLocation, 5));
    }

    /*
     * 1) HOME: User can enter the start location and end location to get the bus
     * numbers, its entire route, timing etc.
     * Example: Suppose you a want to go to place A from place B. You have to enter
     * the start location as place A
     * and end location as place A. It will show you the bus availability
     * nhập vô đầu đuôi xuất ra lộ trình
     */
    public List<List<BusStop>> getAllRoutesFromAToB(BusStop a, BusStop b) {
        List<List<BusStop>> allRoutes = new ArrayList<>();
        HandleBusGraphTool.dfs(a, b, allRoutes, new ArrayList<>());
        HandleBusGraphTool.resetVisitStatus(busStopList);
        return allRoutes;
    }

    /*
     * 2) BUS ROUTES: It will show the all the routes with their route number.
     * Hiện ra tất cả đường và route number
     */
    public HashMap<Integer, List<BusStop>> getAllRoutes() {
        HashMap<Integer, List<BusStop>> map = new HashMap<>();
        for (BusStop bs : busStopList) {
            for (int i : bs.getAssociatedRouteList()) {
                if (map.get(i) == null) {
                    List<BusStop> bsList = new ArrayList<>();
                    map.put(i, bsList);
                }
                map.get(i).add(bs);
            }
        }
        return map;
    }

    /*
     * 3) BUS STOP: User should able to enter the bus stop number. It will show the
     * entire routes, which are
     * associated with the bus stop.
     * nhập vô bus stop number show ra tất cả những tuyến đường đi liên quan tới nó
     */
    public List<BusStop> getAssociatedRoutesByBusNumber(int busNumber) {
        List<BusStop> list = new ArrayList<>();
        list.add(this.busStopList.get(busNumber));
        for (BusStop bs : this.busStopList) {
            if (bs.getBusStopNumber() == busNumber) {
                continue;
            }
            for (Route r : bs.getAdjacentBusStopList()) {
                if (r.getEndBusStop().getBusStopName()
                        .equalsIgnoreCase(this.busStopList.get(busNumber).getBusStopName())) {
                    list.add(bs);
                    break;
                }
            }
        }
        return list;
    }

    /*
     * 4) ROUTE: User should able to enter the route no. It will show the bus stop
     * names associated with the route.
     * nhập vô tuyến đường show ra 2 trạm ở 2 đầu
     */
    public List<BusStop> getBusStopNearby(int routeNumber) {
        List<BusStop> list = new ArrayList<>();
        for (BusStop bs : this.busStopList) {
            if (bs.getAssociatedRouteList().contains(routeNumber)) {
                list.add(bs);
            }
        }
        return list;
    }

    /*
     * 6) AVAILABILITY: User can search for a particular date and get the
     * information whether entire bus service
     * (or a particular route) is available for that day or not
     */
    public boolean isBusServiceAvailable(Date date) {
        if (date.isWorkingDay()) {
            return true;
        }
        return false;
    }

    public List<BusStop> getBusStopList() {
        return busStopList;
    }

    public void setBusStopList(List<BusStop> busStopList) {
        this.busStopList = busStopList;
    }

    public static List<String[]> getComplainBoxList() {
        return complaintBoxList;
    }

    public static void setComplainBoxList(List<String[]> complaintBoxList) {
        BusService.complaintBoxList = complaintBoxList;
    }

    public Map<String, List<BusStop>> getAvailabilityMap() {
        return availabilityMap;
    }

    public void setAvailabilityMap(Map<String, List<BusStop>> availabilityMap) {
        this.availabilityMap = availabilityMap;
    }

}
