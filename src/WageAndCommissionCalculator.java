import java.util.Scanner;
public class WageAndCommissionCalculator {
    public static void main(String[] args) {

        Scanner newUser = new Scanner(System.in);


        System.out.println("Digite seu nome");
        String name = newUser.nextLine();

        System.out.println("Ola " +name+ ", qual o seu salario?");
        double salary = newUser.nextDouble();

        System.out.println("Qual o valor bruto em vendas realizado?");
        double sales = newUser.nextDouble();

        System.out.println("Qual o valor de comissao por vendas?");

        double commission = newUser.nextDouble();
        double finalcommission = commission/100;
        double totalcommission = sales * finalcommission;

        double totalsalary = salary + totalcommission;

        System.out.printf("%s, sua comissao foi de $%.2f, e seu salario total e $%.3f\n", name, totalcommission, totalsalary);

        newUser.close();
    }
}