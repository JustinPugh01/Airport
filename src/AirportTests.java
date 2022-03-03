import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AirportTests {
    @Test
    public void testAiport(){

        Airport airport = new Airport("Manchester Aiport");
        Plane plane = new Plane(657);
        Passenger passenger = new Passenger("Scully");
        BoardingPass pass = new BoardingPass("R4,S3");
        passenger.setBoardingPass(pass);
        plane.BoardPassenger(passenger);
        airport.landplane(plane);
        boolean isInAirport = (airport.getPlanes().contains(plane))&&(plane.getPassenger().contains(passenger));
        assertEquals(isInAirport, true);
        
    }
    @Test
    public void testAirportCheckIn()throws Exception{
        Airport airport = new Airport("Liverpool Airport");
        Plane plane = new Plane(561);
        Passenger passenger = new Passenger("George");
        BoardingPass pass = new BoardingPass("R3,S1");
        Bag bag = new Bag(12);
        airport.Airportcheckin(plane, passenger, pass, bag);
        assertSame(passenger.getpassengerBoardingPass(), pass);
        assertSame(passenger.getPassengerBag(), bag);
        boolean isInAirport2 = (airport.getPlanes().contains(plane))&&(plane.getPassenger().contains(passenger));
        boolean isBagOnPlane = (plane.GetCargo().contains(bag));
        assertEquals(isInAirport2, true);
        assertEquals(isBagOnPlane, true);


    }
    
}
