/*
Escreva um programa que leia um conjunto de 10 números inteiros positivos. 
Seu programa deve determinar e imprimir o maior deles. ​Use o laço FOR. 
 */
package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero = 1, maior = 0;

        for (int i = 1; i <= 3; i++) {

            System.out.printf("Digite o %dº número: ", i);
            numero = leitor.nextInt();

            if (numero >= maior) {
                maior = numero;
            }

        }
        System.out.printf("O maior número digitado é: %d", maior);
    }
}
