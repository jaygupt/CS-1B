public class Foothill {
    public static void main(String[] args) {
        // object of the reverser class
        Reverser<String> reverse = new Reverser<String>();

        // from reverseme to stack
        reverse.fileToStack("C:\\Users\\jaygu\\School\\Foothill\\CS 1B\\Week 9\\src\\reverseme.txt");

        // from stack to reversePoem (poem is reversed)
        reverse.stackToFile("C:\\Users\\jaygu\\School\\Foothill\\CS 1B\\Week 9\\src\\reversePoem.txt");
    }
}
