package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex1Vetor {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int tamanho = leitorInteiro("Tamanho do Vetor: ");
        int[] cria = criaVetor(tamanho);
        int[] vetorPopulado = populaVetor(cria);
        imprimeVetor(vetorPopulado);
    }

   static int leitorInteiro(String msg) {
        boolean caracter = false, menorZero = false;
        int tamanho = 0;
        do {
            try {
                do{
                System.out.print(msg);
                tamanho = Integer.parseInt(leitor.nextLine());
                if (tamanho > 0){
                    menorZero = true;
                }else {
                    System.err.println("Digite um número maior que zero!");
                }
                }while (!menorZero);
                caracter = true;
            } catch (NumberFormatException ex) {
                System.err.println("-----------------Entrada inválida-----------------"
                        + " \n                 tente novamente!");
            }
        } while (!caracter);
        return tamanho;
    }
   
    static int leitor2SemMsg() {
        boolean caracter = false;
        int entrada = 0;
        do {
            try {
                entrada = Integer.parseInt(leitor.nextLine());
                caracter = true;
            } catch (NumberFormatException ex) {
                System.err.println("-----------------Entrada inválida-----------------"
                        + " \n                 tente novamente!");
            }
        } while (!caracter);
        
        return entrada;
    }

    static int[] criaVetor(int leitor) {
        System.out.println("");
        int[] vetor = new int[leitor];

        return vetor;
    }

    static int[] populaVetor(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d recebe: ", (i + 1));
            vetor[i] = leitor2SemMsg();
        }
        return vetor;
    }

    static void imprimeVetor(int[] vetor) {
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor contém: %d \n", (i + 1), vetor[i]);
        }
    }

}
