import java.util.Scanner;
public class compoundInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the start amount: ");
        double startAmount = scanner.nextDouble();

        System.out.println("Please enter the annual interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.println("How many years it will be? ");
        int timeAmount = scanner.nextInt();

        double interestFormula = Math.pow((1 + interestRate/100), timeAmount);
        double totalAmount = startAmount * interestFormula;

        System.out.printf("The total amount after %d years is: %.2f%n", timeAmount, totalAmount);


    scanner.close();
    }

}
