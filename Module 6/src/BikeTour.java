public class BikeTour {
    public static void main(String[] args) {
        Bicycle blue = new Bicycle(4, 5, 3);
        blue.speedUp(2);

        MountainBike red = new MountainBike(2, 3, 4, 5);
        Bicycle bikerack[] = new Bicycle[5];
        bikerack[0] = blue;
        bikerack[1] = red;
        assignOwner(blue, "Lucas");
        assignOwner(red, "Dustin");
    }

    public static void assignOwner(Bicycle bike, String owner) {
        System.out.println("Owner: " + owner);
        System.out.println("Bike id: " + bike.getID());
    }
}
