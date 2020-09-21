public class Main {
    public static void main(String[] args) {
        // creating my three objects of the driverLicense class
        driverLicense myLicense = new driverLicense("Jay Gupta", "123 Sesame Street", 67, 140, "Black", "Green");
        driverLicense defaultLicense = new driverLicense(); // default constructor
        driverLicense friendsLicense = new driverLicense("Aaron", "678 Seedling Drive", 80, 150, "Red", "Blue");

        // calling all mutators and accessors

        // first, accessors
        System.out.println("\nUsing accessors!");
        String friendName = friendsLicense.getName();
        String friendAddress = friendsLicense.getAddress();
        int friendHeight = friendsLicense.getHeight();
        int friendWeight = friendsLicense.getWeight();
        String friendHairColor = friendsLicense.getHairColor();
        String friendEyeColor = friendsLicense.getEyeColor();
        String friendDLNumber = friendsLicense.getDlNumber();

        System.out.println("Hi! My name is: " + friendName + ".\nI live on: " + friendAddress + "\nI am: " + friendHeight
        + " inches tall, and I weigh: " + friendWeight + "lbs.\nMy hair is: " + friendHairColor + ", and my eye color is: " +
        friendEyeColor + ".\nFinally, my driver license number is: " + friendDLNumber);

        // now, mutators
        System.out.println("\nUsing mutators!");
        defaultLicense.setName("Steph Curry");
        defaultLicense.setAddress("1 Warriors Way, San Francisco, CA 94158");
        defaultLicense.setHeight(75);
        defaultLicense.setWeight(190);
        defaultLicense.setHairColor("Blonde");
        defaultLicense.setEyeColor("Hazel");
        defaultLicense.setDlNumber("CA3030");

        String defaultName = defaultLicense.getName();
        String defaultAddress = defaultLicense.getAddress();
        int defaultHeight = defaultLicense.getHeight();
        int defaultWeight = defaultLicense.getWeight();
        String defaultHairColor = defaultLicense.getHairColor();
        String defaultEyeColor = defaultLicense.getEyeColor();
        String defaultDLNumber = defaultLicense.getDlNumber();

        System.out.println("Hi! My name is: " + defaultName + ".\nI live on: " + defaultAddress + "\nI am: " + defaultHeight
        + " inches tall, and I weigh: " + defaultWeight + "lbs.\nMy hair is: " + defaultHairColor + ", and my eye color is: " +
        defaultEyeColor + ".\nFinally, my driver license number is: " + defaultDLNumber);

        // using the copy constructor
        System.out.println("\nUsing the copy constructor!");
        driverLicense newLicense = new driverLicense(myLicense);

        String newName = newLicense.getName();
        String newAddress = newLicense.getAddress();
        int newHeight = newLicense.getHeight();
        int newWeight = newLicense.getWeight();
        String newHairColor = newLicense.getHairColor();
        String newEyeColor = newLicense.getEyeColor();
        String newDlNumber = newLicense.getDlNumber();

        System.out.println("Hi! My name is: " + newName + ".\nI live on: " + newAddress + "\nI am: " + newHeight
        + " inches tall, and I weigh: " + newWeight + "lbs.\nMy hair is: " + newHairColor + ", and my eye color is: " +
        newEyeColor + ".\nFinally, my driver license number is: " + newDlNumber);
    }
}
