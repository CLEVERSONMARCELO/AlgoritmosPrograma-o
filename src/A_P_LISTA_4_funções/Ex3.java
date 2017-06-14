package A_P_LISTA_4_funções;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
      
        int n = leitor("Número: ");
        double f = fatorial(n);
        
    }
  
    public static int leitor(String msg) {

        Scanner leitor = new Scanner(System.in);
        boolean valido = false;
        int n = 0;
        do {
            try {
                System.out.print(msg);
                n = Integer.parseInt(leitor.nextLine());
                valido = true;
            } catch (NumberFormatException ex) {
                System.err.println("Número ou caracter inválido " + ex + "\n --TENTE NOVAMENTE--\n");
                valido = false;
            }
        } while (!valido);
        return n;

    }
    public static double fatorial(int a) {

        double soma = a;
        int sub;

        for (int i = a; i > 1; i--) {

            sub = i - 1;

            soma *= sub;
        }
        System.out.println("O fatorial do número digitado é: " + soma);

        return soma;
    }
}
