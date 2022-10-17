package ss20_case_study.models;

public class Villa extends Facility{
    private String roomStandard;
    private float poolArea;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String serviceName, float usableArea, int rentalCosts, int maxNumberPeople, String rentalType, String roomStandard, float poolArea, int numberFloors) {
        super(serviceName, usableArea, rentalCosts, maxNumberPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
