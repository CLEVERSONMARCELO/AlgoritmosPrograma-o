package A_P_LISTA_2__18_if_else;
import java.util.Scanner;
//Fazer um algoritmo que leia três números e imprime o maior deles.
public class Exerc_13 {
    public static void main(String[] args) {
        
        System.out.println("Digite três números e verifique qual é o maior deles: ");
        Scanner leitor = new Scanner (System.in);
        double n1, n2, n3;
        //entrada
        System.out.print("Digite o 1º número: ");
        n1 = leitor.nextDouble();
        System.out.print("Digite o 2º número: ");
        n2 = leitor.nextDouble();
        System.out.print("Digite o 3º número: ");
        n3 = leitor.nextDouble();
        //processamento/saída
        if ((n1>n2)&&(n1>n3)){ 
            System.out.println("O maior é 1º digitado: " + n1);
        }
        else if ((n2>n3)&&(n2>n1)){ 
            System.out.println("O maior é 2º digitado: " + n2);
        }
        else { 
            System.out.println("O maior é 3º digitado: " + n3);
        } 
    }
}
