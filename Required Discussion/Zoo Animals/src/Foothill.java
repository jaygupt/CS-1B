import java.util.ArrayList;
import java.util.Scanner;

/*
Used console to complete project. 
 */

public class Foothill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id;

        boolean inArrayList;

        ArrayList<iAnimal> animals = new ArrayList<>();

        while (true) {
            inArrayList = false;
            System.out.print("Add a Giraffe? (y or n) ");
            Character userChoice = input.next().charAt(0);

            if (Character.toLowerCase(userChoice) == 'y') {
                Giraffe myGiraffe = new Giraffe();
                System.out.print("Please set the ID tag for Giraffe: ");
                id = input.nextInt();
                myGiraffe.setIdTag(id);
                for (iAnimal animal : animals) {
                    if (animal instanceof Giraffe) {
                        Giraffe thisGiraffe = (Giraffe) animal;
                        if (thisGiraffe.compareTo(myGiraffe) == 0) {
                            System.out.println("This Giraffe is already in the arrayList.");
                            inArrayList = true;
                        }
                    }
                }

                if (!inArrayList || animals.size() == 0) {
                    animals.add(myGiraffe);
                    System.out.println("This Giraffe has been added to the arrayList.");
                }
            }

            inArrayList = false;
            System.out.print("Add an Iguana? (y or n) ");
            userChoice = input.next().charAt(0);

            if (Character.toLowerCase(userChoice) == 'y') {
                Iguana myIguana = new Iguana();
                System.out.print("Please set the ID tag for Iguana: ");
                id = input.nextInt();
                myIguana.setIdTag(id);
                for (iAnimal animal : animals) {
                    if (animal instanceof Iguana) {
                        Iguana thisIguana = (Iguana) animal;
                        if (thisIguana.compareTo(myIguana) == 0) {
                            System.out.println("This Iguana is already in the arrayList.");
                            inArrayList = true;
                        }
                    }
                }

                if (!inArrayList || animals.size() == 0) {
                    animals.add(myIguana);
                    System.out.println("This Iguana has been added to the arrayList.");
                }
            }

            System.out.print("Would you like to add more animals? (y/n) ");
            userChoice = input.next().charAt(0);
            if (Character.toLowerCase(userChoice) != 'y') {
                break;
            }
        }

        System.out.println("\nHere are your animals: ");
        for (iAnimal animal: animals) {
            System.out.println(animal.toString());
        }
    }
}
