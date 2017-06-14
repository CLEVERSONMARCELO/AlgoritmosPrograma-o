package A_P_LISTA_1__10_switch;
import java.util.Scanner;
/**
Criar um programa para identiﬁcar se um mês digitado pelo usuário é de alta ou baixa temporada 
* (considerar os seguintes meses como alta temporada: dezembro a fevereiro, junho e julho). 
 */
public class Exerc_05 {
    public static void main (String[]args){
       Scanner leitor = new Scanner (System.in);
     int mes; 
     System.out.print("Digite um mês, ex: 1 para janeiro - 12 para dezembro: ");
     mes = leitor.nextInt();
     
     switch (mes){
         case 3:
         case 4:
         case 5:
         case 8:
         case 9: 
         case 10:
         case 11:    
          System.out.print("Baixa temporada");
         break;
        
         case 1:
         case 2:
         case 12:
         case 6:
         case 7: 
          System.out.print("Alta temporada");
         break;
         
         default:
           System.out.print("Mês inválido!");  
        }
    }
}
