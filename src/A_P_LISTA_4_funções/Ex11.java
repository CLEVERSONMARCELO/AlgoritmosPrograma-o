package A_P_LISTA_4_funções;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        double nota = leitor("Nota do aluno: ");
        String notaA = nota(nota);
        imprime(notaA);
    }

    static double leitor(String msg) {
        Scanner leitor = new Scanner(System.in);
        System.out.print(msg);
        double nota = Double.parseDouble(leitor.nextLine());
        return nota;
    }

    static String nota(double nota) {

        String notar = null;

        if (nota >= 0.0 && nota <= 4.9) {
            notar = "D";
        } else if (nota >= 5.0 && nota <= 6.9) {
            notar = "C";
        } else if (nota >= 7.0 && nota <= 8.9) {
            notar = "B";
        } else if (nota >= 9.0 && nota <= 10.0) {
            notar = "A";
        } else if (nota < 0.0) {
            System.err.println("---Nota inválida---");
        }
        return notar;
    }

    static void imprime(String notar) {

        System.out.println("Conceito do aluno: " + notar);
    }
}
