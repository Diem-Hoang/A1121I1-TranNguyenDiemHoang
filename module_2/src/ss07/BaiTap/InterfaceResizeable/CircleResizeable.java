package ss07.BaiTap.InterfaceResizeable;
import ss06.ThucHanh.GeometricObject.Circle;

public class CircleResizeable extends Circle implements Resizeable{
    public CircleResizeable(){}
    public CircleResizeable(double radius){
        super(radius);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình tròn sau khi tăng: " + (this.getArea() + this.getArea() * percent/100));
    }
}
