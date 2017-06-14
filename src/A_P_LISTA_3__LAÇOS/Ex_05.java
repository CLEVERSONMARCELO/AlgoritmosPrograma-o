/*
Faça um programa para imprimir os números pares entre 100 e 1, 
em ordem decrescente, ou seja, o laço deve iniciar em 100 e encerrar em 1. ​Use o laço FOR
​ . 
 */
package A_P_LISTA_3__LAÇOS;

public class Ex_05 {

    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {

            int par = i % 2;

            if (par == 0) {

                System.out.println(i);

            }

        }

    }
}
