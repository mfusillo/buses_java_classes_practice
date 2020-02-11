import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public void addPersonToQueue(Person person){
        this.queue.add(person);
    }

    public int getNumberOfPeopleInQueue(){
        return this.queue.size();
    }

    public Person removePersonFromQueue() {
        if(getNumberOfPeopleInQueue() > 0) {
            return this.queue.remove(0);
        }
        return null;
    }

}
