package A_P_LISTA_2__18_if_else;
import java.util.Scanner;
/**
Escreva um programa que leia o número de cadastro de um funcionário, 
seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre na tela o número e o salário do funcionário.  
 */
public class Exerc_09 {
   public static void main (String[] args){
     
       int nc;
       double h, v, resultado;

       Scanner leitor = new Scanner(System.in);
       //ENTRADA
       System.out.println("Digite o número de cadastro do funcionário: ");
       nc = leitor.nextInt();
       System.out.println("Digite o número de horas trabalhadas: ");
       h = leitor.nextDouble();
       System.out.println("Digite o valor de cada hora trabalhada: ");
       v = leitor.nextDouble();
       //PROCESSAMENTO
       resultado = h * v;
       //SAÍDA
       System.out.println("O número de cadastro do funcionário é: " + nc);
       System.out.println("O valor do sálario do funcionário é R$: " + resultado);
       
   }
   
}
