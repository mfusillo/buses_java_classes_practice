import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Princes Street");
        person = new Person();
    }

    @Test
    public void canCheckQueueStartsEmpty(){
        assertEquals(0, busStop.getNumberOfPeopleInQueue());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getNumberOfPeopleInQueue());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(1, busStop.getNumberOfPeopleInQueue());
    }

    @Test
    public void whatTheFuckHappensWhenQueueIs0(){
        BusStop busStop2 = new BusStop("Leith Street");
        busStop2.removePersonFromQueue();
        assertEquals(0, busStop2.getNumberOfPeopleInQueue());
    }



}
