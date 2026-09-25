package mypackage;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

class ToDo extends Trackable{
    private LocalDateTime deadline;
    private int priority;

    ToDo(String title, String discription, LocalDateTime date, LocalDateTime deadline, int priority){
        super(title, discription, date);
        this.deadline = deadline;
        this.priority = priority;
    }

    @Override 
    String getSummary(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return (title + " on " + date.format(formatter) + '\n' + '\t' + discription + '\n');
    }
}