package ss16_read_write_file.thuc_hanh.demo_read_write_file;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
//        students.add(new Student("SV01", "Ngo Van Chau", "12/12/1998","Da Nang"));
//        students.add(new Student("SV02", "Le Thanh Vu", "7/6/2000","Quang Nam"));
//        students.add(new Student("SV03", "Tran Dieu Khanh", "1/9/1999","TT Hue"));
//        students.add(new Student("SV04", "Dao Van Quyet", "8/2/2001","Quang Nam"));

//        FileUtils.writeFile(students, "danhsachsv.csv");
        FileUtils.writeFileOptimize(students, "danhsach.csv");

        List<Student> studentList = FileUtils.readFile("danhsach.csv");
        studentList.forEach(System.out::println);
    }
}
