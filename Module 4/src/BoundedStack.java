import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

public class BoundedStack {
    private ArrayDeque<Double> bs;

    public void load() {
        Scanner input = new Scanner(System.in);
        double userInput = 0;

        while (true) {
            System.out.print("Please input a value (-1 to quit): ");
            userInput = input.nextDouble();
            if (userInput == -1) {
                break;
            }
            Double dUserInput = new Double(userInput);
            if (bs.size() < 50) { // less than 50 elements
                bs.add(dUserInput);
            } else {
                // 50 or more elements

                // remove oldest value
                bs.removeFirst();

                // add new value
                bs.add(dUserInput);
            }
            System.out.println(bs);
        }
    }

    public void pop() {
        // make sure boundedStack has values
        if (bs.size() != 0) {
            // store the most recently added value in variable
            double mostRecent = bs.getLast();

            // display it
            System.out.println(mostRecent);
        }
    }

    public void unload() {
        // make sure bounded stack has values
        if (bs.size() != 0) {
            // loop until number of elements == 0
            while (bs.size() != 0) {
                // display most recent value
                System.out.println(bs.getLast());

                // remove most recent value
                bs.removeLast();
            }
        }
    }

    public BoundedStack() {
        bs = new ArrayDeque<>();
    }
}
