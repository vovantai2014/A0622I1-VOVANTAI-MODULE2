package ss16_read_write_file.thuc_hanh.demo_read_write_file;

public class Student {
    private String id;
    private String name;
    private String dayOfBirth;
    private String address;

    public Student() {
    }

    public Student(String id, String name, String dayOfBirth, String address) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }
    public Student(String string) {
        String[] data = string.split(",");
        this.id = data[0];
        this.name = data[1];
        this.dayOfBirth = data[2];
        this.address = data[3];
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String getInfo(){
        return this.id + "," + this.name + "," + this.dayOfBirth + "," + this.address;
    }
}
