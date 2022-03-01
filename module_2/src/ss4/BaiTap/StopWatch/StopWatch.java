package ss4.BaiTap.StopWatch;


public class StopWatch {
    private double startTime, endTime;

    public void setStartTime(double startTime){
        this.startTime = startTime;
    }
    public double getStartTime(){
        return startTime;
    }
    public void setEndTime(double endTime){
        this.endTime = endTime;
    }
    public double getEndTime(){
        return endTime;
    }
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }
    public double start(){
        this.startTime = System.currentTimeMillis();
        return startTime;
    }
    public double stop(){
        this.endTime = System.currentTimeMillis();
        return endTime;
    }
    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }

}
