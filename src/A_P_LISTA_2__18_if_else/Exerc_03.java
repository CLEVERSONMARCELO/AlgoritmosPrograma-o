/*
 Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. 
O quadrado de um número A é representado por A2
 = A * A.
 */
package A_P_LISTA_2__18_if_else;

import java.util.Scanner;

public class Exerc_03 {

    public static void main(String[] args) {

        double ele1, ele2, resultado;

        System.out.println("Fazer um algoritmo que lê dois números e imprime a soma dos \n "
                + "quadrados dos dois números. O\n"
                + "quadrado de um número A é representado por A2\n"
                + " = A * A.: ");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do 1º número :  ");
        ele1 = leitor.nextInt();

        System.out.println("Digite o valor do 2º número :  ");
        ele2 = leitor.nextInt();

        //processamento 
        ele1 = Math.pow(ele1, 2);
        ele2 = Math.pow(ele2, 2);

        resultado = ele1 + ele2;

        //Saída
        System.out.println("A soma dos quadrados é: " + resultado);
    }
}
