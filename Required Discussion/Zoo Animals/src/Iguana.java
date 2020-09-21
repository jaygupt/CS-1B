class Iguana implements iAnimal, Comparable<Iguana> {
    private int idTag = 001;
    private String animalType = "Iguana";
    private int minTemperature = 75;
    private int maxTemperature = 95;

    public String getAnimalType() {
        return animalType;
    }

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int anIdTag) {
        idTag = anIdTag;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int compareTo(Iguana other) {
        return this.getIdTag() - other.getIdTag();
    }

    public String toString() {
        return getAnimalType() + " ID: " + this.getIdTag() + "  Max Temp: " + getMaxTemperature() + "  Min Temp: " + getMinTemperature();
    }
}

