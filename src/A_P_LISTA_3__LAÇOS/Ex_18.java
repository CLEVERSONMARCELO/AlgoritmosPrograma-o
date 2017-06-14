package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_18 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero, numero1 = 1, numero2 = 0;
        boolean verifica;
        
        do {
        //ENTRADA
        System.out.print("Número menor ou igual à 46: ");
        numero = Integer.parseInt(leitor.nextLine());

        //PROCESSAMENTO
        if (numero <= 46) {

            for (int i = 0; i < numero; i++) {

                numero1 = numero1 + numero2;
                numero2 = numero1 - numero2;

                //SAÍDA
                System.out.print(numero1 + " ");
            }
            break;
        }else {
          System.out.print("Número deve ser menor ou igual à 46\n--TENTE NOVAMENTE--\n"); 
          verifica = false;
        }
        
        }while(!verifica);
    }
}
