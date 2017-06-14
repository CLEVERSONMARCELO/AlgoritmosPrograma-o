package A_P_LISTA_2__18_if_else;
import java.util.Scanner;

public class Exerc_11 {
    /*
    Fazer um algoritmo que lê um número e verifica se ele é negativo. 
    Se for negativo, imprimir na tela a 
    mensagem "Numero negativo". 
     */
   public static void main (String[] args){
      
       Scanner leitor = new Scanner(System.in);
      double n1;

       System.out.println("Digitem um número negativo ");
       n1 = leitor.nextInt();

       if (n1 < 0) {
          
           System.out.println("número negativo " + n1);} 
       else {
           
           System.out.println("número invalido:  " + n1);
       }
       
       }
           }

       
       
      
       
       
       
       
   


