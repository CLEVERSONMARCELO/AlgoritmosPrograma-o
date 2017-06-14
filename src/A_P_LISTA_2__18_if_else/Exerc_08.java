package A_P_LISTA_2__18_if_else;
import java.util.Scanner;

//Fazer um algoritmo que leia quatro números e imprime a ​média aritmética​ dos quatro números. 
public class Exerc_08 {
    public static void main (String[] args){
     
// Entrada de dados
        double P1;
        double P2;
        double P3;
        double P4;
        double Media;
        
        Scanner Leitor1 = new Scanner(System.in);
        
        System.out.println("Digite o valor da 1º prova: ");
        P1 = Leitor1.nextDouble();
        System.out.println("Digite o valor da 2º prova: ");
        P2 = Leitor1.nextDouble();
        System.out.println("Digite o valor da 3º prova: ");
        P3 = Leitor1.nextDouble();
        System.out.println("Digite o valor da 4º prova: ");
        P4 = Leitor1.nextDouble();
        
        //Processamento
        Media = (P1+P2+P3+P4) /4;
        
        //Saída
        System.out.println("A média aritmética é: " + Media);
    }
}
