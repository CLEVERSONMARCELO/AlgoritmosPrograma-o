package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_20_Outro {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double saldoInicial, valor;
        int operação, i = 0;

        System.out.println("---- BANCO ----\n");
        System.out.print("Salda Inicial: ");
        saldoInicial = Double.parseDouble(leitor.nextLine());
        System.out.println(" ");

        double total = saldoInicial;

        do {
            System.out.print("-- OPERAÇÃO --\n\n");
            System.out.println("1 - Depósito ");
            System.out.println("2 - Saque ");
            System.out.println("3 - Extrato ");

            System.out.print("Operação: ");
            operação = Integer.parseInt(leitor.nextLine());
            System.out.println(" ");

            if (operação == 3) {
                break;
            } else if (operação != 1 && operação != 2 && operação != 3) {
                System.err.println("  --  OPERAÇÃO INVÁLIDA  --  ");
            }

            System.out.print("Valor: ");
            valor = Integer.parseInt(leitor.nextLine());
            System.out.println(" ");

            switch (operação) {
                case 1:
                    total += +valor;
                    break;

                case 2:
                    total += -valor;
                    break;
            }
            i++;
        } while (operação == 1 || operação == 2);

        System.out.println(" ");
        System.out.println("O saldo final da conta é: " + total);
        System.out.println(" ");

        if (total < 0) {
            System.out.println("-- CONTA ESTOURADA -- \n\n");
        } else if (total > 0) {
            System.out.println("-- CONTA PREFERENCIAL -- \n\n");
        } else {
            System.out.println("-- CONTA ZERADA -- \n\n");
        }
    }
}
