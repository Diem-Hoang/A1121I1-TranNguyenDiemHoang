package ss07.BaiTap.InterfaceResizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        CircleResizeable circle = new CircleResizeable(3.0);
        System.out.println("Diện tích hình tròn ban đầu: " + circle.getArea());
        circle.resize(50);

    }
}
