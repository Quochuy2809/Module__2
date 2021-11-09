package _4_class_and_object.baitap.stropWatch;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch(){
        startTime= new Date();
    }

    public void start(){
        startTime= new Date();
    }

    public void stop(){
        endTime= new Date();
    }

    public long getElapsedTime(){
        return endTime.getTime() -startTime.getTime();
    }
}
