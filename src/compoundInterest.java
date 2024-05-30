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

        scanner.nextLine();

        System.out.println("It is a depreciation calculus?");
        String userInput = scanner.nextLine();


        if(userInput.equalsIgnoreCase("Yes")){

            double depreciationFormula = Math.pow((1-interestRate/100), timeAmount);
            double depreciationTotal = startAmount * depreciationFormula;

            System.out.printf("Depreciation value in %d years is: %.2f ", timeAmount, depreciationTotal);

        } else if(userInput.equalsIgnoreCase("No")){

            double compoundFormula = Math.pow((1 + interestRate/100), timeAmount);
            double totalAmount = startAmount * compoundFormula;

            System.out.printf("The total amount after %d years is: %.2f%n", timeAmount, totalAmount);

        } else {
            System.out.println("Invalid, please enter YES or NO");
        }




    scanner.close();
    }

}
