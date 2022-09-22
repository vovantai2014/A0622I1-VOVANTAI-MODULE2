package ss7_abstract_and_interface.bai_tap.interface_colorable;

public class CircleColorAble extends Shape {
    private double radius = 1.0;
    private String color = "black";

    public CircleColorAble() {
    }

    public CircleColorAble(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * 3.14;

    }
    public double getPerimeter(){
        return 2 * radius * 3.14;
    }

    @Override
    public String toString() {
        return "CircleColorAble{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", Area='" +getArea() + '\'' +
                '}';
    }

}
