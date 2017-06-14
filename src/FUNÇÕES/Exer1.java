package FUNÇÕES;

import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Nota: ");
        double nota = leitor.nextDouble();
        
        exibirnota(nota);
    }

    public static void exibirnota(double nota) {

        if (nota >= 6) {
            System.out.println("APROVADO \n");
        } else {
            System.out.println("REPROVADO \n");
        }
    }
}
