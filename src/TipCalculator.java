import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercent = scan.nextInt();
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter the item: ");
        String item = scan.nextLine();

        //variables
        double total = 0;
        double totalTip = 0;
        double totalTipBill = 0;
        double beforePeople = 0;
        double tipPeople = 0;
        double afterPeople = 0;
        String itemNames = "";

        while (cost != -1) {
            total = total + cost;
            totalTip = (tipPercent * total) / 100;
            totalTipBill = totalTip + total;
            beforePeople = total / people;
            tipPeople = totalTip / people;
            afterPeople = beforePeople + tipPeople;
            itemNames += item + "\n";
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            scan.nextLine();
            if (cost != -1) {
                System.out.print("Enter the item: ");
                item = scan.nextLine();
            }
            // I learned how to round from here: https://intellipaat.com/community/35143/how-to-round-up-to-2-decimal-places-in-java
            total = Math.round(total * 100.0) / 100.0;
            totalTip = Math.round(totalTip * 100.0) / 100.0;
            totalTipBill = Math.round(totalTipBill * 100.0) / 100.0;
            beforePeople = Math.round(beforePeople * 100.0) / 100.0;
            tipPeople = Math.round(tipPeople * 100.0) / 100.0;
            afterPeople = Math.round(afterPeople * 100.0) / 100.0;
        }
            System.out.println("--------------------------------------------");
            System.out.println("Total bill before tip: $" + total);
            System.out.println("Total percentage: " + tipPercent + "%");
            System.out.println("Total tip: $" + (totalTip));
            System.out.println("Total bill with tip: $" + totalTipBill);
            System.out.println("Per person cost before tip: $" + beforePeople);
            System.out.println("Tip per person: $" + tipPeople);
            System.out.println("Total cost per person: $" + afterPeople);
            System.out.println("--------------------------------------------");
            System.out.println("Items Ordered: \n" + itemNames);
    }
}

