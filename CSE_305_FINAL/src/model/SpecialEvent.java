package model;

public class SpecialEvent {
    private String name;
    private Date date;
    private BusStop[] pickupAndDropLocation;
    private int routeNum;

    public SpecialEvent(String name, Date date, BusStop[] pickupAndDropLocation, int routeNum) {
        this.name = name;
        this.date = date;
        this.pickupAndDropLocation = pickupAndDropLocation;
        this.routeNum = routeNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BusStop[] getPickupAndDropLocation() {
        return pickupAndDropLocation;
    }

    public void setPickupAndDropLocation(BusStop[] pickupAndDropLocation) {
        this.pickupAndDropLocation = pickupAndDropLocation;
    }

    public int getRouteNum() {
        return routeNum;
    }

    public void setRouteNum(int routeNum) {
        this.routeNum = routeNum;
    }

}
