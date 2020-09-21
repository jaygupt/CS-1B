public class MountainBike extends Bicycle {
    // mountainBike subclass adds one field
    public int seatHeight;

    // mountainBike subclass has one constructor
    public MountainBike(int seatHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        this.seatHeight = seatHeight;
    }

    // mountainBike subclass adds one method
    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }
}
