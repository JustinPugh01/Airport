import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class PassengerTests {
    @Test
    public void testPassenger() {
        Passenger passenger = new Passenger("Dave");
        assertEquals(passenger.getName(), "Dave");

    }

    @Test
    public void testCheckinBag() {
        Passenger passenger = new Passenger("Steve");
        Bag bag = new Bag(23);
        passenger.setPassengerBag(bag);
        assertSame(passenger.getPassengerBag(), bag);
    }

    @Test
    public void testPassengerCheckIn() {
        Passenger passenger = new Passenger("Steve");
        BoardingPass pass = new BoardingPass("R12,S5");
        passenger.setBoardingPass(pass);
        assertSame(passenger.getpassengerBoardingPass(), pass);

    }

}
