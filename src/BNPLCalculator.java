import java.util.Scanner;
public class BNPLCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the cost of your product");
        double productCost = scanner.nextDouble();

        System.out.println("Please enter the amount");
        int productAmount = scanner.nextInt();

        System.out.println("Enter the interest rate: ");
        double interestRate = scanner.nextDouble();

        double interestCalc = interestRate / 100;

        double priceWithoutInterest = productAmount * productCost;

        double finalPrice = priceWithoutInterest * interestCalc + priceWithoutInterest;

        double interestCost = finalPrice - priceWithoutInterest;

        System.out.println("Product Amount is: " + productCost);
        System.out.println("Total Products: " + productAmount);
        System.out.println("Price Without Interest: " + priceWithoutInterest);
        System.out.println("Price With Interest: " + finalPrice);
        System.out.println("Interest Cost: " + interestCost);

        scanner.close();
    }
}

