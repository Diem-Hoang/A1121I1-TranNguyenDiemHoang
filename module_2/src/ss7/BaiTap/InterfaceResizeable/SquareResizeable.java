package ss7.BaiTap.InterfaceResizeable;
import ss6.ThucHanh.GeometricObject.Square;

public class SquareResizeable extends Square implements Resizeable{
    public SquareResizeable(double side) {
        super(side);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình vuông sau khi tăng: "+ (this.getArea() + this.getArea() * percent/100));
    }
}
