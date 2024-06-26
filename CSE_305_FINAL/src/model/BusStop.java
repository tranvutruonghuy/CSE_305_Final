package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusStop {
    private String busStopName;
    private int busStopNumber;
    private List<Route> adjacentBusStopList = new ArrayList<>(); // Use to BFS
    private List<Integer> associatedRouteList = new ArrayList<>(); // List of route
    private Map<Integer, String[]> departureTimeOfEachRoute = new HashMap<>(); // To get departure time about the routes
                                                                               // and To check
    // whether routes are belongs to the bus stop
    private boolean isVisited;

    public BusStop(String busStopName, int busStopNumber) {
        this.busStopName = busStopName;
        this.busStopNumber = busStopNumber;
    }

    public String getBusStopName() {
        return busStopName;
    }

    public void setBusStopName(String busStopName) {
        this.busStopName = busStopName;
    }

    public int getBusStopNumber() {
        return busStopNumber;
    }

    public void setBusStopNumber(int busStopNumber) {
        this.busStopNumber = busStopNumber;
    }

    public List<Route> getAdjacentBusStopList() {
        return adjacentBusStopList;
    }

    public void setAdjacentBusStopList(List<Route> adjacentBusStopList) {
        this.adjacentBusStopList = adjacentBusStopList;
    }

    public List<Integer> getAssociatedRouteList() {
        return associatedRouteList;
    }

    public void setAssociatedRouteList(List<Integer> associatedRouteList) {
        this.associatedRouteList = associatedRouteList;
    }

    public Map<Integer, String[]> getDepartureTimeOfEachRoute() {
        return departureTimeOfEachRoute;
    }

    public void setDepartureTimeOfEachRoute(Map<Integer, String[]> departureTimeOfEachRoute) {
        this.departureTimeOfEachRoute = departureTimeOfEachRoute;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public String getTimeByRouteNum(int routeNum) {
        String[] temp = departureTimeOfEachRoute.get(routeNum);
        String s = "";
        for (int i = 0; i < temp.length; i++) {
            s += temp[i] + "          ";
        }
        return s;
    }

    public int findRouteNumByDestinationBusNum(int busStopNum) {
        int routeNum = 0;
        for (Route r : this.adjacentBusStopList) {
            if (r.getEndBusStop().getBusStopNumber() == busStopNum) {
                routeNum = r.getRouteNum();
                break;
            }
        }
        return routeNum;
    }

    public String findDestinationNameByRouteNum(int routeNum) {
        String s = "";
        for (Route r : this.adjacentBusStopList) {
            if (r.getRouteNum() == routeNum) {
                s = r.getEndBusStop().getBusStopName();
                break;
            }
        }
        return s;
    }
}
