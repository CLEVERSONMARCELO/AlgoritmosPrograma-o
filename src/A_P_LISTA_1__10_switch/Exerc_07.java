package A_P_LISTA_1__10_switch;
import java.util.Scanner;
/**
 Criar um programa para identiﬁcar o valor a ser pago por um plano de saúde
 * dada a idade do conveniado, 
 * considerando que todos pagam R$ 100 mais um adicional conforme 
 * a seguinte tabela:
 * 1) crianças com menos de 10 anos pagam R$80;
 * 2) conveniados com idade entre 10 e 30 anos pagam R$50; 
 * 3) conveniados com idade entre 40 e 60 anos pagam R$ 95;
 * 4) conveniados com mais de 60 anos pagam R$130.
 */
public class Exerc_07 {
    public static void main (String[]args){
        
       Scanner leitor = new Scanner (System.in);
     double PrecoFixo=100;
     int idade;
     System.out.print("Digite a idade do conveniado: ");
     idade = leitor.nextInt();   
         
     switch (idade){
         case 0:
         case 1:    
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:    
         case 8:    
         case 9:    
             System.out.print("O valor a ser pago é "+(PrecoFixo+80) +" reias\n\n\n");
         break;
         
         case 10:
         case 11:    
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:    
         case 18:    
         case 19: 
         case 20:
         case 21:    
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:    
         case 28:    
         case 29:
         case 30:
             System.out.print("O valor a ser pago é "+(PrecoFixo+50) +" reias\n\n\n");
         break;

         case 40:
         case 41:    
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:    
         case 48:    
         case 49: 
         case 50:
         case 51:    
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:    
         case 58:    
         case 59:
         case 60:
             System.out.print("O valor a ser pago é "+(PrecoFixo+95) +" reias\n\n\n");
         break;
         
         default:
             if (idade>=60)
                 System.out.print("O valor a ser pago é "+(PrecoFixo+130) +" reias\n\n\n");
             
             else System.out.print("Idade inválida!\n\n\n");
        }
    }
}








