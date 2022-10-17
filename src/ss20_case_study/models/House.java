package ss20_case_study.models;

public class House extends Facility{
    private String roomStandard;
    private int numberFloors;

    public House() {
    }

    public House(String serviceName, float usableArea, int rentalCosts, int maxNumberPeople, String rentalType, String roomStandard, int numberFloors) {
        super(serviceName, usableArea, rentalCosts, maxNumberPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }


    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
