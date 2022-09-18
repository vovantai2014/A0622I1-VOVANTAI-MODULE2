package ss5_access_modifier_static_method.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private final double PI = 3.14159;
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (this.radius * this.radius * this.PI);
    }
}
