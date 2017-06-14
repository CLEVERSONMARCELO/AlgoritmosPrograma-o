/*
 Fazer um algoritmo que lê dois números inteiros
e imprime os números consecutivos desses números. 
Por exemplo: se o usuário digitar 2 e ­9, a saída deverá 
ser 3 e ­8, porque 3 é consecutivo de 2. –8 é consecutivo de –9) 
 */
package A_P_LISTA_2__18_if_else;

import java.util.Scanner;

public class Exerc_04 {

    public static void main(String[] args) {

        int n1, n2;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        n1 = leitor.nextInt();

        System.out.print("Digite o 2º número: ");
        n2 = leitor.nextInt();

        System.out.print("Consecutivo do 1º número é:  " + ++n1);
        System.out.println(" ");
        System.out.print("Consecutivo do 1º número é:  " + ++n2);

    }
}
