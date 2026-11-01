import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the quantity of items: ");
        int quantity = input.nextInt();

        System.out.print("Enter the price of one item: ");
        double price = input.nextDouble();

        double totalCost = quantity * price;

        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total cost: " + totalCost);

        input.close();
    }
}