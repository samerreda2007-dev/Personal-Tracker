import java.time.LocalDateTime;

import mypackage.*;


public class Main {
    public static void main(String args[]){
    Data data = new Data();
    LocalDateTime start = LocalDateTime.now();
    LocalDateTime end = start.plusWeeks(1);

    for (Trackable t : data.allItems) {
        t.showSchedule(start, end);
    }
}
    
}