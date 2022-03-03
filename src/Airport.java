import java.util.ArrayList;

public class Airport {
    private String airport;
    private ArrayList<Plane> planelist = new ArrayList();

    public Airport(String airport){
        this.airport = airport;
    }

    public String getAirport(){
        return this.airport;
    }
    public void landplane(Plane plane) {
        planelist.add(plane);
    }
    public ArrayList<Plane> getPlanes() {
        return this.planelist;
    }
    
    public void Airportcheckin(Plane plane,Passenger passenger,BoardingPass pass,Bag bag){
        passenger.setBoardingPass(pass);
        plane.BoardPassenger(passenger);
        planelist.add(plane);
        passenger.setPassengerBag(bag);
        plane.LoadBag(bag);
    }
    
    
}

