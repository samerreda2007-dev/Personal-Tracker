package mypackage;
import java.util.LocalDateTime;
class Event extends Trackables{
    private LocalDateTime reservationTime;
    private int frequenceOfReminder;

    Event(String title, String discription, LocalDateTime date, LocalDateTime reservationTime, int frequenceOfReminder){
        super(title, discription, date);
        this.reservationTime = reservationTime;
        this.frequenceOfReminder = frequenceOfReminder;
    }

    @Override 
    String getSummary(){
        return (title + " on " + date + '\n' + '\t' + discription + '\n');
    }
}