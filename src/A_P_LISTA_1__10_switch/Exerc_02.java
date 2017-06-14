package A_P_LISTA_1__10_switch;
import java.util.Scanner;
/*
Crie um programa que exibe se um dia é dia útil, 
ﬁm de semana ou dia inválido dado o número referente ao dia. 
Considere que domingo é o dia 1 e sábado é o dia 7. 
 */
public class Exerc_02 {
    public static void main (String[]args){
        Scanner leitor = new Scanner (System.in);
        int dia;
        System.out.print("Digite um dia da semana - 1 domingo, 2 sábado\n");
        dia = leitor.nextInt();
        switch (dia){
            case 1:
               System.out.printf("Domingo - fim de semana\n\n");
            case 7:   
               System.out.printf("Sábado - fim de semana\n\n"); 
            break;
             case 2:
             case 3:
             case 4:
             case 5:
             case 6:
               System.out.printf("Dia útil!\n\n"); 
            break;
            default:
              System.out.printf("Dia %d digitado é inválido\n\n",dia);   
        }
    }
}
