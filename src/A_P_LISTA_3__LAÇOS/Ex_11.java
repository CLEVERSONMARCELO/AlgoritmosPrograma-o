package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Entrada
        int numero;
        double soma = 1;

        System.out.print("Número inteiro: ");
        numero = Integer.parseInt(leitor.nextLine());

        //Processamento
        if (numero > 0) {

            for (int i = 2; i <= numero; i++) {//repete o i até o número digitado

                if (i % 2 == 0) {
                    soma -= 1.0 / i;//soma recebe soma - 1.0 dividido por i
                } else {
                    soma += 1.0 / i;//soma recebe soma + 1.0 dividido por i
                }
            }

            //Saída
            System.out.print(soma);
        } else {
            System.out.print("Número digitado inválido");
        }
    }
}
