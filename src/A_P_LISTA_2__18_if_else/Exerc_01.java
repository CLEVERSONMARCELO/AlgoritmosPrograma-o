package A_P_LISTA_2__18_if_else;

import java.util.Scanner;

/*Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois
números
 */
public class Exerc_01 {

    public static void main(String[] args) {

        int n1, n2, resultado;

        System.out.println("--Multiplicar 2 números-- ");
        //entrada

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o 1º número: ");
        n1 = leitor.nextInt();

        System.out.println("Digite o 1º número: ");
        n2 = leitor.nextInt();

        //processamento
        resultado = n1 * n2;

        //Saída
        System.out.println("O resultado da sua multiplicação é : " + resultado);

    }
}
