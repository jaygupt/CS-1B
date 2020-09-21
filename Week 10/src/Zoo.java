public class Zoo {
    public static void main(String[] args) {
        penguinList king = new penguinList(45821, 11, 90);
        king.addFirst(45888, 15, 92);
        king.addFirst(45777, 11, 91);
        System.out.println(king.getFirstId());
        System.out.println(king.getFirstWeight());
        System.out.println(king.getFirstHeight());
        System.out.println(king.getListSize());
    }
}
