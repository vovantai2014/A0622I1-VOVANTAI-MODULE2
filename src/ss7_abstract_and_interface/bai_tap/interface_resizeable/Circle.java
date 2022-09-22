package ss7_abstract_and_interface.bai_tap.interface_resizeable;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public double getPerimeter() {
        return 2 * radius * 3.14;
    }
    @Override
    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                + getArea()
                + ", Perimeter=" +
                + getPerimeter();
    }
    @Override
    public void resize(double percent){
        this.radius = this.radius * (percent * 10);
    }
}
