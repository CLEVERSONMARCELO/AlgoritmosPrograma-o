package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_20 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double saldo, valor;
        int i = 0, operação;

        System.out.print("-----CONTA BANCÁRIA-----\n\n");

        System.out.print("Saldo: ");
        saldo = Double.parseDouble(leitor.nextLine());
        System.out.print("\n");

        double total = saldo;

        do {

            System.out.print("---ESCOLHA A OPERAÇÃO---\n\n");
            System.out.print("1 - DEPÓSITO\n");
            System.out.print("2 - SAQUE\n");
            System.out.print("3 - EXTRATO\n");
            System.out.print("Operação: ");
            operação = Integer.parseInt(leitor.nextLine());

            if (operação == 3) {
                break;
            } else if (operação != 1 && operação != 2 && operação != 3) {
                System.out.print("OPERAÇÃO INVÁLIDA");
                break;
            }

            System.out.print("QUAL O VALOR DA OPERAÇÃO: ");
            valor = Double.parseDouble(leitor.nextLine());

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

        System.out.print(" ");
        System.out.print("---Extrato---\n");
        System.out.print("Saldo atual da conta R$: " + total);
        System.out.print(" ");
        
        if (total == 0) {
            System.out.print("\nCONTA ZERADA");
        } else if (total < 0) {
            System.out.print("\nCONTA ESTOURADA");
        } else if (total > 0) {
            System.out.print("\nCONTA PREFERENCIAL");
        }
    }
}
