package A_P_LISTA_5_Array;

import java.util.Scanner;

public class Ex21Vetor {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int totalAlunos = Ex1Vetor.leitorInteiro("Quantidade de alunos: ");
        String[] nomes = criaVnomes(totalAlunos);
        double[] notas = criaVnotas(totalAlunos);
        ImprimeMediaAlunos(nomes, notas);
    }

    static String[] criaVnomes(int totalAlunos) {
        System.out.println(" ");

        String[] nomes = new String[totalAlunos];

        return nomes;
    }

    static double[] criaVnotas(int totalAlunos) {

        double[] notas = new double[totalAlunos];

        return notas;
    }

    static void ImprimeMediaAlunos(String[] nomes, double[] notas) {

        double soma = 0, media, maiorNota;
        String maiorNome;
        
        for (int i = 0; i < nomes.length; i++) {

            System.out.printf("Nome do %dº aluno: ", (i + 1));
            nomes[i] = leitor.nextLine();
            nomes[i] = nomes[i].toUpperCase();// nome maiusculo

            System.out.print("Nota: ");
            notas[i] = Double.parseDouble(leitor.nextLine());
            System.out.println("");
        }

        for (int j = 0; j < notas.length; j++) {
            soma += notas[j];
        }
        media = soma / notas.length;

        System.out.printf("Média da SALA: %.2f ", media);
        System.out.println("\n");
        for (int j = 0; j < notas.length; j++) {
            
            if (notas[j] > media) {
                    maiorNota = notas[j];
                    maiorNome = nomes[j];

                    System.out.printf("Aluno(a) %s com nota %.2f é maior que a média! ", maiorNome,maiorNota);
                    System.out.println(" ");
            }
        }
    }
}
