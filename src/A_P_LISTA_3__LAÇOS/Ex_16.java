package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_16 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero, i = 1, valorTeste, divisão;

        //ENTRADA
        System.out.print("Número de testes: ");
        numero = Integer.parseInt(leitor.nextLine());
        System.out.println(" ");
        //PROCESSAMENTO
        if (numero > 0) {

            do {
                System.out.print("Valor: ");
                valorTeste = Integer.parseInt(leitor.nextLine());

                divisão = valorTeste % 2;

                //SAÍDA
//VERIFICA SE VALOR É PAR OU IMPAR                
                if (divisão == 0 && valorTeste != 0) {
                    System.out.println("Valor é PAR");
                } else if (divisão != 0) {
                    System.out.println("Valor é IMPAR");
                } else if (divisão == -1) {
                    System.out.println("Valor é IMPAR");
                }
 //VERIFICA SE VALOR DIGITADO É NEGATIVO OU POSITIVO                   
                if (valorTeste > 0) {
                    System.out.println("POSITIVO");
                } else if (valorTeste < 0) {
                    System.out.println("NEGATIVO");
                }
////VERIFICA SE VALOR DIGITADO É 0
                if (valorTeste == 0) {
                    System.out.println("NULO");
                }

                i++;
            } while (i <= numero);

        } else {
            System.out.print("Número de vezes deve ser  > 0 ");

        }

    }
}
