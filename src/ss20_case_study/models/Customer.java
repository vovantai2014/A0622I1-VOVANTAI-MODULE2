package ss20_case_study.models;

public class Customer extends Person {
    private String typeCustomer;

    public Customer() {
    }

    public Customer(int id,
                    String name,
                    String dateOfBirth,
                    String sex,
                    int idNumber,
                    int phoneNumber,
                    String email,
                    String address,
                    String typeCustomer) {
        super(id, name, dateOfBirth, sex, idNumber, phoneNumber, email, address);
        this.typeCustomer = typeCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "typeCustomer='" + typeCustomer + '\'' +
                '}';
    }
}
