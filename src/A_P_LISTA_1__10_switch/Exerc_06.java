package A_P_LISTA_1__10_switch;
import java.util.Scanner;
/**
Criar um programa para identiﬁcar se um dia da semana 
* (numerados de 1 a 7) é dia de semana, ﬁm de semana ou um dia inválido. 
 */
public class Exerc_06 {
    public static void main (String[]args){
      Scanner leitor = new Scanner (System.in);
     int dia; 
     System.out.print("Digite um dia da semana, ex: 1 domingo - 7 sábado: ");
     dia = leitor.nextInt();  
        
     switch (dia){
         case 1:
         case 7:
             System.out.printf("Dia %d da semana -  é fim de semana!\n\n\n",dia);
         break;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
             System.out.printf("Dia %d da semana - é dia de semana!\n\n\n",dia);
         break;
         default:
             System.out.printf("Dia %d é inválido!!!\n\n\n",dia);
     }
    }
}
