package ss16_read_write_file.bai_tap.read_file_csv;

import ss16_read_write_file.thuc_hanh.demo_read_write_file.FileUtils;
import ss16_read_write_file.thuc_hanh.demo_read_write_file.Student;

import java.util.ArrayList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;


public class TestCountry {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
//        countryList.add(new Country("1","AU","Australia"));
//        countryList.add(new Country("2","BRZ","Brazil"));
//        countryList.add(new Country("3","JP","Japan"));
//        countryList.add(new Country("4","USA","United Stated"));
//        countryList.add(new Country("5","IND","Indian"));
//        countryList.add(new Country("6","VN","Viet Nam"));
//        countryList.add(new Country("7","LAO","Laos"));
//        countryList.add(new Country("8","KOR","Korea"));
//
        WriteReadFile.writeFile(countryList,"danhsachquocgia.csv");

        List<Country> countryList1 = WriteReadFile.readFile("danhsachquocgia.csv");
        countryList1.forEach(System.out::println);

    }
}
