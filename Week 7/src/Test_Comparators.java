public class Test_Comparators {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        apple1.setWeight(10);
        apple2.setWeight(8);

        int result = apple1.compareTo(apple2);

        System.out.println(result);
    }
}
