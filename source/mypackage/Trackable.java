package mypackage;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class Trackable {
    protected String title;
    protected String discription;
    protected LocalDateTime date;
    
    Trackable(String title, String discription, LocalDateTime date){
        this.title = title;
        this.discription = discription;
        this.date = date;
    }

    abstract String getSummary();


    public void showSchedule(LocalDateTime start, LocalDateTime end){
        if (!date.isBefore(start) && date.isBefore(end)) {
            System.out.println(getSummary());
        }
    }
    
}