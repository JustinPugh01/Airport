public class Passenger {
    private String name;
    private BoardingPass boardingPass;
    private Bag passengerBag;
    private String seatnumber;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public String getSeatNumber(){
        return this.seatnumber;
    }
    public void setSeatNumber(String seatnumber){
        this.seatnumber = seatnumber;
    }
    public void setBoardingPass(BoardingPass pass) {
        this.boardingPass = pass;
    }

    public BoardingPass passengerCheckIn() {
        return this.boardingPass;
    }

    public void setPassengerBag(Bag weight) {
        this.passengerBag = weight;
    }

    public Bag CheckInBag() {
        return this.passengerBag;
    }

}
