public class Apple implements Comparable<Apple> {
    private String variety;
    private String color;
    private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Apple other) {
        if (this.weight < other.weight) {
            return -1;
        } else if (this.weight > other.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
