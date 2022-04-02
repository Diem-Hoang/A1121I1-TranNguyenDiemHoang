package ss07.BaiTap.InterfaceColorable;
import ss06.ThucHanh.GeometricObject.Square;
import ss07.BaiTap.InterfaceResizeable.SquareResizeable;

public class SquareColorable extends Square implements Colorable{
    public SquareColorable(){
    }
    public SquareColorable(double side) {
        super(side);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
