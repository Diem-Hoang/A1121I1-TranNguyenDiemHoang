package ss06.BaiTap.CircleCylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder("green", 2.0, 6.0);
        System.out.println(cylinder);
    }
}
