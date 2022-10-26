package ss16_read_write_file.bai_tap.read_file_csv;

public class Country {
    private String number;
    private String id;
    private String name;

    public Country() {
    }

    public Country(String number, String id, String name) {
        this.number = number;
        this.id = id;
        this.name = name;
    }
    public Country(String string){
        String[] data = string.split(",");
        this.number = data[0];
        this.id = data[1];
        this.name = data[2];
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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


    @Override
    public String toString() {
        return "Country{" +
                "number=" + number +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public String getInfo(){
        return this.number + "," + this.id + "," + this.name;
    }
}
