package ss7_abstract_and_interface.bai_tap.interface_resizeable;

public class Square extends Shape {
    private double side = 1.0;

    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void resize(double percent) {
        this.side = this.side * (percent * 10);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                + getArea()
                + ", Perimeter=" +
                + getPerimeter();
    }
}
