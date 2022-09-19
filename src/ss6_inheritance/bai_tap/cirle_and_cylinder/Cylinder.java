package ss6_inheritance.bai_tap.cirle_and_cylinder;

public class Cylinder extends Circle {
    private double height = 2;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }
    @Override
    public String toString(){
        return "Hinh tru co ban kinh :"
                +getRadius()
                +", co chieu cao :"
                + getHeight()
                +", mau sac :"
                +getColor();

    }
}
