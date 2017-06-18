package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex2Vetor {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int tamanho = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
        double[] criaVetor = cria(tamanho);
        double[] popuplaVetor = popula(criaVetor);
        ImprimeSoma(popuplaVetor);
    }
    
    static double leitor2double() {
        boolean caracter = false;
        double entrada = 0;
        do {
            try {
                entrada = Double.parseDouble(leitor.nextLine());
                caracter = true;
            } catch (NumberFormatException ex) {
                System.err.println("-----------------Entrada inválida-----------------"
                        + " \n                 tente novamente!");
            }
        } while (!caracter);
        
        return entrada;
    }
    
    static double[] cria(int tamanho) {

        double[] vetor = new double[tamanho];

        return vetor;
    }

    static double[] popula(double[] vetor) {
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d recebe: ", (i+1));
            vetor[i] = leitor2double();
        }
        System.out.println("");
        return vetor;
    }

    static void ImprimeSoma(double[] popula) {

        double soma = 0;

        for (int i = 0; i < popula.length; i++) {

            soma += popula[i];
        }
        System.out.printf("A soma dos elementos é: %.2f",soma);
    }

    static double leitor2double(String multiplicar_elementos_do_vetor_por_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
     
