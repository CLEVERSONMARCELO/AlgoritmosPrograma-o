package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_21 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero, i = 1, resto, soma = 0;

        System.out.print("Número: ");
        numero = Integer.parseInt(leitor.nextLine());

        while (i < numero) {

            resto = numero % i;

            if (resto == 0) {
                soma += i;
            }
        i++;
        System.out.print(i+"\n");
        }

        if (soma == numero) {
            System.out.print("-- Número perfeito --");
        } else {
            System.out.print("-- Não é perfeito --");
        }
    }
}
