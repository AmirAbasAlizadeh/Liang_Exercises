import java.util.Date;
import java.util.Scanner;
public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch(){
        Date currentTime = new Date();
        this.startTime = currentTime.getTime();
        System.out.println("Timer initialized : " + this.startTime);
    }
    public void start(){
        Date currentTime = new Date();
        this.startTime = currentTime.getTime();
        System.out.println(this.startTime);
    }
    public void stop(){
        Date endedTime = new Date();
        this.endTime = endedTime.getTime();
    }
    public void getElapsedTime(){
        double elapsedTime = this.endTime - this.startTime;
        System.out.println("Time elapsed since " + this.startTime + " : " + elapsedTime + " at " + this.endTime);
    }
}