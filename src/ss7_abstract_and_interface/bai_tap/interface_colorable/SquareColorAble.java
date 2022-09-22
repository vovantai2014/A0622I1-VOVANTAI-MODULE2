package ss7_abstract_and_interface.bai_tap.interface_colorable;

public class SquareColorAble extends Shape implements Colorable{
    private double side;

    public SquareColorAble() {
    }

    public SquareColorAble(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side * side;
    }
    public double getPerimeter(){
        return side * 4;
    }

    @Override
    public String toString() {
        return "SquareColorAble{" +
                "side=" + side +
                ", Square Area =" + getArea() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
