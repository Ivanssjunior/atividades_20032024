import java.util.Scanner;
public class BNPLCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the cost of your product");
        double productCost = scanner.nextInt();

        System.out.println("Please enter the ammount");
        int productAmmount = scanner.nextInt();

        double finalPrice = productAmmount * productCost;

        System.out.println("Total Ammount is: " + productCost);
        System.out.println("Total Products: " + productAmmount);
        System.out.println("Final price: " + finalPrice);

        scanner.close();
    }
}

