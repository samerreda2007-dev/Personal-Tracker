package mypackage;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
class Event extends Trackable{
    private LocalDateTime reservationTime;
    private int frequenceOfReminder;

    Event(String title, String discription, LocalDateTime date, LocalDateTime reservationTime, int frequenceOfReminder){
        super(title, discription, date);
        this.reservationTime = reservationTime;
        this.frequenceOfReminder = frequenceOfReminder;
    }

    @Override 
    String getSummary(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return (title + " on " + date.format(formatter) + '\n' + '\t' + discription + '\n');
    }
}