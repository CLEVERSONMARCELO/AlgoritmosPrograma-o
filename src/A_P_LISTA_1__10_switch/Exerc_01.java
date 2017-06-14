package A_P_LISTA_1__10_switch;
import java.util.Scanner;
 /*
Crie um programa que veriﬁca se um número inteiro 
informado pelo usuário é divisível por 3.
*/
public class Exerc_01 {
   public static void main (String[]args){
       
       Scanner leitor = new Scanner (System.in);
       int n,resultado;
       System.out.print("Digite um número: ");
       n = leitor.nextInt();
       
       resultado =n%3;
       
       switch (resultado){
           case 0:
            System.out.print("O número é divisivel por \"3\"\n\n\n");
            break;
            default:
            System.out.print("Não divisível por \"3\"\n\n\n");
       }
    }
}