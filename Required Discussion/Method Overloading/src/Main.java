import java.util.Scanner;

public class Main {
    public static float interest(float p, float r, float t) {
        float si;
        si = (r * t * p) / 100;
        return si;
    }

    public static void interest() {
        Scanner input = new Scanner(System.in);
        float p, r, t, si;

        System.out.print("Enter the principal: ");
        p = input.nextFloat();

        System.out.print("Enter the rate of interest: ");
        r = input.nextFloat();

        System.out.print("Enter the time period: ");
        t = input.nextFloat();

        si = (r * t * p) / 100;
        System.out.println("The Simple Interest is: " + si);
    }

    public static void main(String[] args) {
        // declare variables
        Scanner input = new Scanner(System.in);
        float p, r, t, si;

        System.out.println("\nUsing the overloaded method!");
        System.out.print("Enter the principal: ");
        p = input.nextFloat();

        System.out.print("Enter the rate of interest: ");
        r = input.nextFloat();

        System.out.print("Enter the time period: ");
        t = input.nextFloat();

        // using the overloaded method
        si = interest(p, r, t);
        System.out.println("The Simple Interest is: " + si);

        // using the regular method
        System.out.println("\nUsing the regular method!");
        interest();
    }
}

/*
Output:
Using the overloaded method!
Enter the principal: 20202
Enter the rate of interest: 2.5
Enter the time period: 3
The Simple Interest is: 1515.15

Using the regular method!
Enter the principal: 20202
Enter the rate of interest: 2.5
Enter the time period: 3
The Simple Interest is: 1515.15

Process finished with exit code 0
 */