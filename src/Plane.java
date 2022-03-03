import java.util.ArrayList;

public class Plane {
    private int planenumber; 
    private ArrayList<Passenger> passengerlist = new ArrayList();
    private ArrayList<Bag> cargolist = new ArrayList();


    public Plane(int planenumber){
        this.planenumber= planenumber; 
    }

    public int getPlaneNumber(){
        return this.planenumber;
    }
    public void BoardPassenger(Passenger passenger) {
        passengerlist.add(passenger);
    }

    public ArrayList<Passenger> getPassenger() {
        return this.passengerlist;
    }
    
    public void LoadBag(Bag bag){
        cargolist.add(bag);

    }
    public ArrayList<Bag> GetCargo(){
        return this.cargolist;
    }

}

