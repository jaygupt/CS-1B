public class driverLicense {
    private String name;
    private String address;
    private int height, weight;
    private String hairColor, eyeColor;
    private String dlNumber;

    static int licenseCount = 1000;

    // all information given constructor
    public driverLicense(String name, String address, int height, int weight, String hairColor, String eyeColor) {
        // using this construct
        this.name = name;
        this.address = address;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;

        this.dlNumber = numberGenerator();
        licenseCount++;
    }

    // default constructor
    public driverLicense() {
        // set default values
        setName("Default");
        setAddress("123 Caspian Blvd.");
        setHeight(60);
        setWeight(130);
        setHairColor("Black");
        setEyeColor("Blue");
        setDlNumber(numberGenerator());
        licenseCount++;
    }

    // copy constructor
    public driverLicense(driverLicense dl) {
        this.name = dl.name;
        this.address = dl.address;
        this.height = dl.height;
        this.weight = dl.weight;
        this.hairColor = dl.hairColor;
        this.eyeColor = dl.eyeColor;
        this.dlNumber = dl.dlNumber;
    }

    private static String numberGenerator() {
        String stateAbbreviation = "CA";
        String licenseNumber = stateAbbreviation + licenseCount;
        return licenseNumber;
    }

    // accessor and mutator methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getDlNumber() {
        return dlNumber;
    }
    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
    }
}
