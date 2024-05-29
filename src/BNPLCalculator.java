import java.util.Scanner;
public class BNPLCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the cost of your product");
        double productCost = scanner.nextDouble();

        System.out.println("Please enter the amount");
        int productAmount = scanner.nextInt();

        double priceWithoutInterest = productAmount * productCost;

        scanner.nextLine();

        System.out.println("Are you going to pay in cash? Please Enter YES or NO ");
        String userInput = scanner.nextLine();

        if(userInput.equalsIgnoreCase("Yes")){
            System.out.println("Your total amount is: " +priceWithoutInterest );

        } else if (userInput.equalsIgnoreCase("No")) {
            System.out.println("How many months it will be the Instalment Plan? ");
            int instalmentPlan = scanner.nextInt();
            System.out.println("Please enter the monthly interest rate: ");
            double interestRate = scanner.nextDouble();

            double totalInterest = priceWithoutInterest * (interestRate/100) * instalmentPlan;
            double totalPriceWithInterest = priceWithoutInterest + totalInterest;

            System.out.println("Your total amount with interest is: " +totalPriceWithInterest);

        } else {
            System.out.println("Invalid Input, please enter Yes or No");
        }
        scanner.close();
    }
}

