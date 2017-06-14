
package A_P_Aula_05_if_else;
import java.util.Scanner;
/**
 *
 * @author cleverson.mdias
 */
public class Exerc_02 {
    public static void main(String[] args){
       Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite o 1º número: ");
        double n1 = leitor.nextDouble();
        
        
        System.out.print("Digite o 2º número: ");
        double n2 = leitor.nextDouble();
        
        if (n1%n2==0){System.out.println("A divisão do 1º número, pelo 2º é uma divisão exata");
        }
        else {System.out.println("Divisão não exata!");
        }
        
        
        
        
        
        
        
        
    }
}
