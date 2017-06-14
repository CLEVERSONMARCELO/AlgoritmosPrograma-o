package FUNÇÕES;

import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor: ");
        double x = leitor.nextDouble();

        double resultado = funcaofx(x);

    }

    public static double funcaofx(double x) {
        double calculo = 0;

        if (x < -1) {

            calculo = x + 2;
            System.out.println(calculo);

        } else if ((x >= -1 && x >= 2)) {
            calculo = (Math.pow(x, 2));
            System.out.println(calculo);

        } else if (x > 2) {
            calculo = ((2 * x)) - 1;
            System.out.println(calculo);
        }
        return calculo;
    }
}
