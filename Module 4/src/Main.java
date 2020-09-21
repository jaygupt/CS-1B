public class Main {
    public static void main(String[] args) {
        String divider = "\n--------------------\n";
        BoundedStack bs = new BoundedStack();
        System.out.println("Using the load method!\n");
        bs.load();
        System.out.println(divider);
        System.out.println("Using the pop method!\n");
        bs.pop();
        System.out.println(divider);
        System.out.println("Using the unload method!\n");
        bs.unload();
    }
}
