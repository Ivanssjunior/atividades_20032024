import java.util.Scanner;
public class SwitchValues {
    public static void main(String[] args) {
        Scanner newValue = new Scanner(System.in);
        Scanner respostaUsuario = new Scanner (System.in);

        System.out.println("Digite um valor para A");
        double firstValue = newValue.nextDouble();

        System.out.println("Digite um valor para B");
        double secondValue = newValue.nextDouble();

        

        System.out.println("Voce gostaria de inverter o resultado? Digite SIM ou NAO");
        
        String userInput = respostaUsuario.nextLine();
        
        if(userInput.equalsIgnoreCase("Sim")){
            
            double temp = firstValue;
            firstValue = secondValue;
            secondValue = temp;

            System.out.print("Valores trocados");
            System.out.printf("Valor A Alterado: %s, Valor B alterado: $%.2f\n", firstValue, secondValue);
            
        } else if (userInput.equalsIgnoreCase("Nao")){
            
            System.out.printf("Valor A original: $%s, Valor original B: $%.2f\n", firstValue, secondValue);
            
        } else {
            System.out.println("Resposta Invalida, Digite SIM ou NAO");
        }
        
        newValue.close();
        respostaUsuario.close();

    }

    
}
