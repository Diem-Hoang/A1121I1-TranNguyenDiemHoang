package ss4.BaiTap.Fan;

public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public Fan(){

    }
    public String toString(){
        if(this.on){
            return "speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius + "\n Fan is on";
        } else {
            return "color: " + this.color + ", radius: " + this.radius + "\n Fan is off";
        }
    }
}
