package A_P_Aula_05_if_else;
import java.util.Scanner;

public class Exerc_03 {
   public static void main(String[] args){
       
       Scanner leitor = new Scanner (System.in);
       
       System.out.print("Digite a sua altura: ");
       double a = leitor.nextDouble();
       System.out.print("Digite seu peso: ");
       double p = leitor.nextDouble();
       
       double imc = Math.pow(a,2);
       
       if (p/imc<26){System.out.println("Seu grau de obsidade é normal");
       }
       else if (p/imc>=26&&p/imc<30){System.out.println("Seu grau de obsidade é obeso");
       }
       else if (p/imc>=30){System.out.println("Seu grau de obsidade é obeso mórbido");
       }
   } 
}
