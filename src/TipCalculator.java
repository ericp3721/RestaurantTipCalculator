import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!");
        System.out.print("How many people are in your group?");
        int people = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost = scan.nextDouble();
        while (cost != -1){
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
        }

    }
}
