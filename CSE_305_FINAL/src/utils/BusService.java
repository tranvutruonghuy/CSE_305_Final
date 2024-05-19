package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.BusStop;

public class BusService {
    private List<BusStop> busStopList;
    private static List<String[]> complaintBoxList = ComplaintBoxDAO.loadListFromFileChar("ComplaintBox.txt");
    private Map<String, List<BusStop>> availabilityMap;

    public BusService() {
        this.busStopList = new ArrayList<>();
        // Initialize Bus Stop
        busStopList.add(new BusStop("University", 0));
        busStopList.add(new BusStop("Library", 1));
        busStopList.add(new BusStop("Sport Community", 2));
        busStopList.add(new BusStop("Dormitory", 3));
        busStopList.add(new BusStop("Airport", 4));

        // Add adjacent
        this.busStopList.get(0).getAdjacentBusStopList().add(this.busStopList.get(1));
        this.busStopList.get(0).getAdjacentBusStopList().add(this.busStopList.get(3));
        this.busStopList.get(1).getAdjacentBusStopList().add(this.busStopList.get(0));
        this.busStopList.get(1).getAdjacentBusStopList().add(this.busStopList.get(2));
        this.busStopList.get(2).getAdjacentBusStopList().add(this.busStopList.get(3));
        this.busStopList.get(3).getAdjacentBusStopList().add(this.busStopList.get(0));
        this.busStopList.get(3).getAdjacentBusStopList().add(this.busStopList.get(2));
        this.busStopList.get(3).getAdjacentBusStopList().add(this.busStopList.get(4));
        this.busStopList.get(4).getAdjacentBusStopList().add(this.busStopList.get(3));

        // Add associatedRoutes
        this.getBusStopList().get(0).getAssociatedRouteMap().put(1, true);
        this.getBusStopList().get(0).getAssociatedRouteMap().put(4, true);
        this.getBusStopList().get(1).getAssociatedRouteMap().put(1, true);
        this.getBusStopList().get(1).getAssociatedRouteMap().put(2, true);
        this.getBusStopList().get(2).getAssociatedRouteMap().put(3, true);
        this.getBusStopList().get(3).getAssociatedRouteMap().put(3, true);
        this.getBusStopList().get(3).getAssociatedRouteMap().put(4, true);
        this.getBusStopList().get(3).getAssociatedRouteMap().put(5, true);
        this.getBusStopList().get(4).getAssociatedRouteMap().put(5, true);

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
