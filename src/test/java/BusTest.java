import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus1;
    private Person person;

    @Before
    public void before(){
        bus1 = new Bus("Balerno", 30);
        person = new Person();
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




}
