import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Person person){
        if(this.capacity > getNumberOfPassengers()) {
            this.passengers.add(person);
        }
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop){
        while (busStop.getNumberOfPeopleInQueue() != 0){
            Person person = busStop.removePersonFromQueue();
            addPassenger(person);
        }


    }

}
