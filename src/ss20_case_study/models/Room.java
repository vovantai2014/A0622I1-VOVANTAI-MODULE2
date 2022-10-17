package ss20_case_study.models;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceName, float usableArea, int rentalCosts, int maxNumberPeople, String rentalType, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCosts, maxNumberPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }


    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
}
