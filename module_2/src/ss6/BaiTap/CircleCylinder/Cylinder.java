package ss6.BaiTap.CircleCylinder;

public class Cylinder extends Circle{
    private double height = 5.0;

    public Cylinder(){

    }
    public Cylinder(String color, double radius, double height){
        super(color,radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + "\nVolume: " + getVolume();
    }

}
