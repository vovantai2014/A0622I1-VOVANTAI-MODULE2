package ss5_access_modifier_static_method.bai_tap.lop_chi_ghi_trong_java;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        String name = "Nakatomo";
        String classes = "Nihongg Chuukyu";
        student1.setName(name);
        student1.setClasses(classes);
        System.out.println("Name :" + name +" , " + " Class :" +classes);
    }
}
