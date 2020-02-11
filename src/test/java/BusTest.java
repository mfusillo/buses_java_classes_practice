import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus1;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus1 = new Bus("Balerno", 30);
        person = new Person();
        busStop = new BusStop("Princes Street");
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
    }

    @Test
    public void busCapacityStartsEmpty(){
        assertEquals(0, bus1.getNumberOfPassengers());
    }

    @Test
    public void canAddPassengersIfUnderCapacity(){
        bus1.addPassenger(person);
        assertEquals(1, bus1.getNumberOfPassengers());
    }

    @Test
    public void cannotAddPassengerIfAtCapacity(){
        Bus bus2 = new Bus("Fountainpark", 1);
        bus2.addPassenger(person);
        bus2.addPassenger(person);
        assertEquals(1, bus2.getNumberOfPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus1.addPassenger(person);
        bus1.addPassenger(person);
        bus1.removePassenger();
        assertEquals(1, bus1.getNumberOfPassengers());
    }

    @Test
    public void canRemovePersonFromQueueAndAddToBus(){
        bus1.pickUp(busStop);
        assertEquals(4, bus1.getNumberOfPassengers());
    }

    @Test
    public void cannotAddPassengersFromQueueWhenAtCapacity(){
        Bus bus3 = new Bus("Castle Terrace", 6);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        bus3.pickUp(busStop);
        assertEquals(6, bus3.getNumberOfPassengers());
    }


}
