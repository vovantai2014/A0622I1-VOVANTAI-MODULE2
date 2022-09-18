package ss5_access_modifier_static_method.bai_tap.lop_chi_ghi_trong_java;

public class Student {
    private String name = "Jonh";
    private String classes = "CO2";

    public Student() {
    }
    public Student(String name, String classes){
        this.name = name;
        this.classes = classes;

    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
