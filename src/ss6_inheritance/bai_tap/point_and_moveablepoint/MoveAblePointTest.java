package ss6_inheritance.bai_tap.point_and_moveablepoint;

public class MoveAblePointTest {
    public static void main(String[] args) {
        Point point = new Point(3,4);
        System.out.println(point.toString());
        point.setXY(5,6);
        System.out.println(point.toString());

        point = new MoveAblePoint(7,8,point.getX(),point.getY());
        System.out.println(point.toString());

        ((MoveAblePoint) point).getMove();
        System.out.println(point.toString());

        MoveAblePoint moveAblePoint = new MoveAblePoint(9,10,9,10);
        System.out.println(moveAblePoint.toString());
        moveAblePoint.getMove();
        System.out.println(moveAblePoint.toString());
    }
}
