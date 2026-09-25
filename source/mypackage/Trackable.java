package mypackage;
import java.time.LocalDateTime;
import java.util.Date;

abstract class Trackable {
    protected String title;
    protected String discription;
    protected LocalDateTime date;
    
    Trackables(String title, String discription, LocalDateTime date){
        this.discription = discription;
        this.date = date;
    }

    abstract String getSummary();


    public void showSchedule(LocalDateTime start, LocalDateTime end){
    
    }
    
}