package ss07.BaiTap.InterfaceColorable;

import ss06.ThucHanh.GeometricObject.Square;

public class ColorableTest{
    public static void main(String[] args) {
        Square[] square = new Square[5];
        square[0] = new Square();
        square[1] = new Square(5.0);
        square[2] = new Square(3.0);
        square[3] = new SquareColorable();
        square[4] = new SquareColorable(4.0);

        for(int i=0; i<square.length; i++){
            System.out.println("Area of square " + i + " is: " + square[i].getArea());
            if(square[i] instanceof SquareColorable){
                System.out.print("Square has Colorable is square " + i + ": ");
                ((SquareColorable) square[i]).howToColor();
            }
        }
    }
}
