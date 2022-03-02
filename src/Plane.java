import java.util.ArrayList;

public class Plane {
    private int planenumber; 
    private ArrayList<Passenger> passengerlist = new ArrayList();


    public Plane(int planenumber){
        this.planenumber= planenumber; 
    }

    public int getPlaneNumber(){
        return this.planenumber;
    }
    public void checkInPassenger(Passenger passenger) {
        passengerlist.add(passenger);
    }

    public ArrayList<Passenger> getPassenger() {
        return this.passengerlist;
    }
    

}

