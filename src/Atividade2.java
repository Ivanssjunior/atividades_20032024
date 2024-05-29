import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner newValue = new Scanner(System.in);

        System.out.println("Digite um valor para A");
        double firstValue = newValue.nextDouble();

        System.out.println("Digite um valor para B");
        double secondValue = newValue.nextDouble();

        System.out.printf("Valor A original: $%s, Valor original B: $%.2f\n", firstValue, secondValue);

        double temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;

        System.out.print("Valores trocados");
        System.out.printf("Valor A Alterado: %s, Valor B alterado: $%.2f\n", firstValue, secondValue);

        newValue.close();

    }

    
}
