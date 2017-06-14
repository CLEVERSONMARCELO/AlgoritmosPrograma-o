package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_17 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero, sobra;

        //ENTRADA
        System.out.print("Número inteiro: ");
        numero = Integer.parseInt(leitor.nextLine());

        //SAÍDA
         System.out.println("O número digitado é divisível por:  "); 
        
        //PROCESSAMENTO
        for (int i = numero; i > 0; i--) {

            sobra = numero % i;

            if (sobra == 0) {

        //SAÍDA
                System.out.print(i+" ");
            }
        }
    }
}
