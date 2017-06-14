package A_P_Aula_06_Switch;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int n;

        System.out.println(" ---Tabuada--- \n");
        System.out.print("Número: ");
        n = leitor.nextInt();

        if (n >= 2 && n <= 1000) {

            int i = 1;

            do {

                System.out.println(i + "  X  " + n + "  =   " + (n * i));

                i++;

            } while (i <= 10);
            
        } else {
            System.err.println("Número deve ser maior ou igual a dois ou menor que 1000");
            
        }
    }
}
