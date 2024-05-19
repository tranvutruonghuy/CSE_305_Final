package model;

import java.util.List;
import java.util.Map;

public class BusStop {
    private String busStopName;
    private int busStopNumber;
    private List<BusStop> adjacentBusStopList; // Use to BFS
    private Map<Integer, Boolean> associatedRouteMap; // To check whether routes are belongs to the bus stop
    private Map<Integer, String[]> departureTimeOfEachRoute; // To get departure time about the routes

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

    public List<BusStop> getAdjacentBusStopList() {
        return adjacentBusStopList;
    }

    public void setAdjacentBusStopList(List<BusStop> adjacentBusStopList) {
        this.adjacentBusStopList = adjacentBusStopList;
    }

    public Map<Integer, Boolean> getAssociatedRouteMap() {
        return associatedRouteMap;
    }

    public void setAssociatedRouteMap(Map<Integer, Boolean> associatedRouteMap) {
        this.associatedRouteMap = associatedRouteMap;
    }

    public Map<Integer, String[]> getDepartureTimeOfEachRoute() {
        return departureTimeOfEachRoute;
    }

    public void setDepartureTimeOfEachRoute(Map<Integer, String[]> departureTimeOfEachRoute) {
        this.departureTimeOfEachRoute = departureTimeOfEachRoute;
    }

}
