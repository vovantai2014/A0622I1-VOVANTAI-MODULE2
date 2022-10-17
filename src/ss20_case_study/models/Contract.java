package ss20_case_study.models;

public class Contract {
    private int contractId;
    private int bookingId;
    private int deposit;
    private int totalPayment;
    private int customerId;

    public Contract() {
    }

    public Contract(int contractId, int bookingId, int deposit, int totalPayment, int customerId) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.customerId = customerId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
