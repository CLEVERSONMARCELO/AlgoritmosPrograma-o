package A_P_LISTA_4_funções;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
      
        int a = recebe("Valor de A: ");
        int b = recebe("Valor de B: ");
        int c = recebe("Valor de C: ");
        double resultado = raiz(a, b, c);
    }
    
    static int recebe (String msg){
        Scanner leitor = new Scanner(System.in);
        
        System.out.print(msg);
        int numero = Integer.parseInt(leitor.nextLine());
        
        return numero;
    }
    static double raiz(int a, int b, int c) {

        double maior = 0;
        double delta = Math.pow(b, 2) - (4 * a * c);

        double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
        
        if (delta  >= 0 ){
        
        if (x1 > x2) {
            maior = x1;
            System.out.println("Maior Raiz: " + maior);
        } else {
            maior = x2;
            System.out.println("Maior Raiz: " + maior);
        }
        }else {
            System.out.println("Delta menou que zero \"-1\"");
        }
        return maior;
    }
}
