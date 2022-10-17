package ss20_case_study.service.iplm;

import ss20_case_study.models.Employee;
import ss20_case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployServiceImplement implements EmployeeService {
    Scanner sc = new Scanner(System.in);
    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    @Override
    public void display() {
        for (Employee employee : employeeArrayList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNew() {
        System.out.print("Nhap ID nhan vien: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap TEN nhan vien: ");
        String name = sc.nextLine();
        System.out.print("Nhap NGAY THANG NAM SINH cua nhan vien: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("Nhap GIOI TINH nhan vien: ");
        String sex = sc.nextLine();
        System.out.print("Nhap SO CMND cua nhan vien: ");
        int idNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap SO ĐT cua nhan vien: ");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap EMAIL cua nhan vien: ");
        String email = sc.nextLine();
        System.out.print("Nhap DIA CHI cua nhan vien: ");
        String address = sc.nextLine();
        System.out.print("Nhap TRINH DO cua nhan vien: ");
        String level = sc.nextLine();
        System.out.print("Nhap VI TRI nhan vien: ");
        String location = sc.nextLine();
        System.out.print("Nhap LUONG cua nhan vien: ");
        int salary = Integer.parseInt(sc.nextLine());

        Employee employee = new Employee(id,
                name, dateOfBirth, sex, idNumber,
                phoneNumber, email, address, level,
                location, salary);
        employeeArrayList.add(employee);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
