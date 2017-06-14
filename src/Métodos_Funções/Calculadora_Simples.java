package Métodos_Funções;

import java.util.Scanner;
public class Calculadora_Simples {

    public static void main(String[] args) {
        double n1 = leitor("Número 1: ");
        double n2 = leitor("Número 2: ");
        String op = operação();
        double resultado = calculo(n1, n2, op);
        exibirresultado(resultado);
    }
    public static double leitor(String mensagem) {
        Scanner leitor = new Scanner(System.in);
        double numero = 0;
        boolean valido = false;
        do {
            try {
                System.out.print(mensagem);
                numero = Double.parseDouble(leitor.nextLine());
                valido = true;
            } catch (NumberFormatException ex) {
                System.err.println("Número inválido\nTente novamente...");
            }
        } while (!valido);
        return numero;
    }
    public static String operação() {
        Scanner leitor = new Scanner(System.in);
        boolean valido = false;
        String op = "";
        do {
            System.out.print("Qual a operação: ");
            op = leitor.nextLine();

            if (op.equals("-") || op.equals("+") || op.equals("/") || op.equals("*")) {
                valido = true;
            } else {
                System.out.println("Operação inválida\n UTILIZE ( - , + , / , * )");
            }
        } while (!valido);
        return op;
    }
    public static double calculo(double n1, double n2, String op) {
        double calculo = 0;
        switch (op) {
            case "+":
                calculo = n1 + n2;
                break;
            case "-":
                calculo = n1 - n2;
                break;
            case "/":
                calculo = n1 / n2;
                break;
            case "*":
                calculo = n1 * n2;
                break;
        }
        return calculo;
    }
    public static void exibirresultado(double calculo) {
        System.out.println("O resultado da sua operação é: " + calculo);
    }
}
