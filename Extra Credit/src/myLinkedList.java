public class myLinkedList {
    Node head;
    int size;

    class Node {
        String touristName;
        int passportNumber;
        String destinationCity;
        Node next;

        // this constructor will create a new node with the given data
        public Node(String touristName, int passportNumber, String destinationCity) {
            super();
            this.touristName = touristName;
            this.passportNumber = passportNumber;
            this.destinationCity = destinationCity;
            next = null;
        }
    }

    // adds a new tourist to the beginning of the list
    public void addFirst(String touristName, int passportNumber, String destinationCity) {
        // create a new node with given data
        Node myNewNode = new Node(touristName, passportNumber, destinationCity);

        myNewNode.next = head;

        // head will be the node we just created; this makes it the beginning of the list
        head = myNewNode;
        // update the size instance variable
        size++;
    }

    // find tourist's name in list, return destination. We will be using iteration to traverse the list
    public String findNode(String touristName) {
        String dne = "Does not exist in list.";
        Node currentTourist = head;
        // iterate through linked list
        while (currentTourist != null) {
            // if currentTourist's name equals what we are looking for, return the destination
            if (currentTourist.touristName.equals(touristName)) {
                return currentTourist.destinationCity;
            }

            // if we haven't found it yet, go to next tourist
            currentTourist = currentTourist.next;
        }
        return dne;
    }

    // return number of tourists in the list
    public int size() {
        return size; // each time we addFirst, the size was updated
    }
}
