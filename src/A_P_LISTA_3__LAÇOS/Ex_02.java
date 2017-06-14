/*
Faça um programa que leia um número N do usuário, 2
some todos os números inteiros de 1 a N, e mostre o resultado obtido. ​Use o laço WHILE. 
 */
package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero, i = 1, soma = 0;

        System.out.print("Número inteiro: ");
        numero = leitor.nextInt();

        while (i <= numero) {

            soma += i;
            i++;
        }
        System.out.print("soma da repetição: "+ soma + "\n\n");
    }
}
