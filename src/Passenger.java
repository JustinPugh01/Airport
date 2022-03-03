public class Passenger {
    private String name;
    private BoardingPass boardingPass;
    private Bag passengerBag;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setBoardingPass(BoardingPass pass) {
        this.boardingPass = pass;
    }

    public BoardingPass getpassengerBoardingPass() {
        return this.boardingPass;
    }

    public void setPassengerBag(Bag weight) {
        this.passengerBag = weight;
    }

    public Bag getPassengerBag() {
        return this.passengerBag;
    }

}
