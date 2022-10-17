package ss20_case_study.models;

public class Booking {
    private int bookingId;
    private int customerId;
    private int deposit;
    private String depositDate;

    public Booking() {
    }

    public Booking(int customerId, int deposit, String depositDate) {
        this.customerId = customerId;
        this.deposit = deposit;
        this.depositDate = depositDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public String getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(String depositDate) {
        this.depositDate = depositDate;
    }
}
