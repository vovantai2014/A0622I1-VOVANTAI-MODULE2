package ss6_inheritance.thuc_hanh.geometric_inheritance;

public class Rectangle extends Shape {
    private double length = 1;
    private double width = 1;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }
    @Override
    public String toString(){
        return "A Rectangle with width= "
                +getWidth()
                + " and length = "
                +getLength()
                + ", which is a subclass of"
                + super.toString();
    }

}
