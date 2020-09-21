import java.text.NumberFormat;
import java.util.Locale;

public class rectangularArrays {
    public static void main(String[] args) {
        int row, col;
        double[][] moon = new double[4][6];

        NumberFormat tidy = NumberFormat.getInstance(Locale.US);
        tidy.setMaximumFractionDigits(3);
        tidy.setMinimumFractionDigits(3);

        // load array with values
        for (row = 0; row < moon.length; row++) {
            for (col = 0; col < moon[row].length; col++) {
                moon[row][col] = (row + 1.) / (col + 1.);
            }
        }

        /*
        // print out the whole array
        for (row = 0; row < moon.length; row++) {
            for (col = 0; col < moon[row].length; col++) {
                System.out.print(tidy.format(moon[row][col]) + " ");
            }
            System.out.println();
        }
         */

        /*
        // print out the 3rd column (col = 2)
        for (row = 0; row < moon.length; row++) {
            System.out.println(tidy.format(moon[row][2]));
        }
         */

        // print out the 3rd row (row = 2)
        for (col = 0; col < moon[2].length; col++) {
            System.out.print(tidy.format(moon[2][col]) + " ");
        }
    }
}
