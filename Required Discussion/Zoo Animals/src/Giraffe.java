public class Giraffe implements iAnimal, Comparable<Giraffe> {
    private final String animalType;
    private int id;
    private final int minTemperature;
    private final int maxTemperature;

    public Giraffe() {
        animalType = "Giraffe";
        id = 0;
        minTemperature = 60;
        maxTemperature = 80;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setIdTag(int anIdTag) {
        this.id = anIdTag;
    };

    public int getIdTag() {
        return id;
    };

    public int getMinTemperature() {
        return minTemperature;
    };

    public int getMaxTemperature() {
        return maxTemperature;
    };

    public int compareTo(Giraffe other) {
        return this.getIdTag() - other.getIdTag();
    }

    public String toString() {
        return getAnimalType() + " ID: " + getIdTag() + "  Max Temp: " + getMaxTemperature() + "  Min Temp: " + getMinTemperature();
    }
}
