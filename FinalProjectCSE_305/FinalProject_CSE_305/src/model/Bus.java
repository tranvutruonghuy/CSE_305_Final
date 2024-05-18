package src.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bus {
    private int busNumber;
    private List<Bus> adjacentBusStop = new ArrayList<>();
    private HashMap<Integer, String[]> departureTimeOfEachRoute = new HashMap<>();

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public List<Bus> getAdjacentBusStop() {
        return adjacentBusStop;
    }

    public void setAdjacentBusStop(List<Bus> adjacentBusStop) {
        this.adjacentBusStop = adjacentBusStop;
    }

    public HashMap<Integer, String[]> getDepartureTimeOfEachRoute() {
        return departureTimeOfEachRoute;
    }

    public void setDepartureTimeOfEachRoute(HashMap<Integer, String[]> departureTimeOfEachRoute) {
        this.departureTimeOfEachRoute = departureTimeOfEachRoute;
    }

}
