package model;

public class SpecialEvent {
    private String name;
    private Date date;
    private int[] pickupAndDropLocation;
    private int routeNum;

    public SpecialEvent(String name, Date date, int[] pickupAndDropLocation, int routeNum) {
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

    public int[] getPickupAndDropLocation() {
        return pickupAndDropLocation;
    }

    public void setPickupAndDropLocation(int[] pickupAndDropLocation) {
        this.pickupAndDropLocation = pickupAndDropLocation;
    }

    public int getRouteNum() {
        return routeNum;
    }

    public void setRouteNum(int routeNum) {
        this.routeNum = routeNum;
    }

}
