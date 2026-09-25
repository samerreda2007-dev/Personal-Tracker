package mypackage;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;


public class Data {
    public List<Trackable> allItems = new ArrayList<>();
    Event eventTest = new Event("EventTest","DiscriptionTest",LocalDateTime.now().plusMinutes(5),LocalDateTime.now().plusDays(3), 2);
    ToDo  toDoTest = new ToDo("todo Test", "todo discription test", LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(5), 1);
    public Data(){
        allItems.add(eventTest);
        allItems.add(toDoTest);
    }


}