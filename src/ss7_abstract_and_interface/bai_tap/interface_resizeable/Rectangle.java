package ss7_abstract_and_interface.bai_tap.interface_resizeable;

public class Rectangle extends Shape {
    private double length ;
    private double width ;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
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
        return (width + length) * 2;
    }

    @Override
    public void resize(double percent) {
        this.length = this.length * (percent * 3);
        this.width = this.width * (percent * 3);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                + getArea()
                + ", Perimeter=" +
                + getPerimeter();
    }
}
