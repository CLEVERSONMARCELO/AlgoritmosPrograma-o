package A_P_LISTA_2__18_if_else;
import java.util.Scanner;
//Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor. 
public class Exerc_14 {
    public static void main (String[] args){
        
        System.out.println("Digite 2 números, e obtenha a divisão do maior número pelo menor: ");
        Scanner leitor = new Scanner (System.in);
        double n1, n2;
        //entrada
        System.out.print("Digite o 1º número: ");
        n1 = leitor.nextDouble();
        System.out.print("Digite o 2º número: ");
        n2 = leitor.nextDouble();
        
        //processamento
        if (n1>n2){
            System.out.println(n1/n2);
        
        }else {System.out.println(n2/n1);
        
        }
    }
}
