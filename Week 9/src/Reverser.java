import java.io.*;
import java.util.ArrayDeque;
import java.util.Iterator;

// Reverser class (is generic)
public class Reverser<E> {
    // private object of java.util.ArrayDeque class
    ArrayDeque<E> deque = new ArrayDeque<E>();
    String line;

    // fileToStack method, with input as input filename
    public void fileToStack(String writingFile) {
        try {
            BufferedReader myFileIn = new BufferedReader(new FileReader(writingFile));
            // reading the file, whilst filling ArrayDeque object
            for (int k = 0; ((line = myFileIn.readLine()) != null); k++) {
                deque.push((E) line);
            }
            // closing file
            myFileIn.close();
        } catch (IOException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }

    // stackToFile method, with input as output filename
    public void stackToFile(String readingFile) {
        try {
            PrintWriter myFileOut = new PrintWriter(readingFile);
            // contents of ArrayDeque object written to specified file
            // output file contains same lines as input file, but in reverse
            for (int j = 0; !deque.isEmpty(); j++) {
                myFileOut.println((E) deque.removeFirst()); // LIFO structure. Taking the first seems like reverse to us
            }
            myFileOut.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
