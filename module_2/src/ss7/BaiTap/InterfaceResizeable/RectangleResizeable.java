package ss7.BaiTap.InterfaceResizeable;
import ss6.ThucHanh.GeometricObject.Rectangle;

public class RectangleResizeable extends Rectangle implements Resizeable {
    public RectangleResizeable(double width, double length) {
        super(width,length);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình chữ nhật sau khi tăng: " + (this.getArea() + this.getArea() * percent/100));
    }
}
