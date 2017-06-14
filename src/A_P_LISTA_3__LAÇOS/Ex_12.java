package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Entrada 
        double soma = 0;
        int numero;
        System.out.print("Número natural: ");
        numero = leitor.nextInt();

        //Processamento
        if (numero > 0) {

            for (int i = 0; i < 3; i++) {

                soma += (1.0 + i) / (numero - i);
            }
            for (int i = 2; i >= 0; i--) {

                soma += (numero - i) / (1.0 + i);
            }
            //Saída 
            System.out.print(soma);

        } else {
            System.out.println("Número inválido!  ");
        }
    }
}
