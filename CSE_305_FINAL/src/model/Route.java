package model;

public class Route {
    private int routeNum;
    private BusStop endBusStop;

    public Route(int routeNum, BusStop endBusStop) {
        this.routeNum = routeNum;
        this.endBusStop = endBusStop;
    }

    public int getRouteNum() {
        return routeNum;
    }

    public void setRouteNum(int routeNum) {
        this.routeNum = routeNum;
    }

    public BusStop getEndBusStop() {
        return endBusStop;
    }

    public void setEndBusStop(BusStop endBusStop) {
        this.endBusStop = endBusStop;
    }

}
