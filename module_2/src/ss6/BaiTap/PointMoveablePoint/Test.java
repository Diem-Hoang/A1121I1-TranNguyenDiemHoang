package ss6.BaiTap.PointMoveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(3,5);
        MoveablePoint moveablePoint = new MoveablePoint(2,3,4,5);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
        //System.out.println(point);
    }
}
