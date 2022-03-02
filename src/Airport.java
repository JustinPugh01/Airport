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
    public void inboundplane(Plane plane) {
        planelist.add(plane);
    }
    public ArrayList<Plane> getPlanes() {
        return this.planelist;
    }
    
}
