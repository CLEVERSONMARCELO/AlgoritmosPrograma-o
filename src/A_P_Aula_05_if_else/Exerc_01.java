package A_P_Aula_05_if_else;
import java.util.Scanner;

public class Exerc_01 {
    public static void main(String[] args){
    
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digitem um número maior que 100: ");
        double n1 = leitor.nextDouble();
        
        if (n1>100){System.out.printf("Número %.2f + 150 = "+(n1+150),n1);
        }
        else if (n1==100){System.out.println("Número digitado é igual a 100, digite um número maior que 100");
        }
            else {System.out.println("número digitado é menor que 100, digite um número maior que 100");
        }
    }
}
        
      