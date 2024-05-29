import java.util.Scanner;
public class BNPLCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the cost of your product");
        double productCost = scanner.nextDouble();

        System.out.println("Please enter the amount");
        int productAmount = scanner.nextInt();

        double priceWithoutInterest = productAmount * productCost;

        System.out.print("Are you going to pay in cash? Please Enter YES or NO");
        String userInput = scanner.nextLine();

        if(userInput.equalsIgnoreCase("Yes")){
            System.out.println("Your total amount is: " +priceWithoutInterest );
        } else if (userInput.equalsIgnoreCase("No")) {
            System.out.print("You said No");
        } else {
            System.out.println("Invalid Input, please enter Yes or No");
        }


        /*
        --> The basic interest calculus is here, trying to figure out how to make a new one with a installment payment plans<<--
        First -  enter the cost of your product, and amount
        Second - choose Cash or intalment payment, enter how many months it will be paid
        Third  - Enter the interest fee
        Fourth - The whole "receipt" system



        System.out.println("Enter the interest rate: ");
        double interestRate = scanner.nextDouble();

        double interestCalc = interestRate / 100;

        double finalPrice = priceWithoutInterest * interestCalc + priceWithoutInterest;

        double interestCost = finalPrice - priceWithoutInterest;

        System.out.println("Product Amount is: " + productCost);
        System.out.println("Total Products: " + productAmount);
        System.out.println("Price Without Interest: " + priceWithoutInterest);
        System.out.println("Price With Interest: " + finalPrice);
        System.out.println("Interest Cost: " + interestCost);
*/
        scanner.close();
    }
}

