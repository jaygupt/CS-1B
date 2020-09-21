public class Foothill {
    public static void main(String[] args) {
        // as instructions dictated, created object called tourist of linked list class
        myLinkedList tourist = new myLinkedList();

        // using addFirst to add three tourists
        tourist.addFirst("Waldo", 12345, "Prague");
        tourist.addFirst("Camilla", 67890, "Madrid");
        tourist.addFirst("Aiden", 29102301, "Dublin");

        // findNode...

        // beginning
        System.out.println(tourist.findNode("Aiden"));

        // middle
        System.out.println(tourist.findNode("Camilla"));

        // end
        System.out.println(tourist.findNode("Waldo"));

        // does not exist
        System.out.println(tourist.findNode("Jay"));

        // EXTRA: This wasn't in assignment, just wanted to test out size functionality!

        System.out.println("\nThe size of the linked list is: " + tourist.size());
    }
}
