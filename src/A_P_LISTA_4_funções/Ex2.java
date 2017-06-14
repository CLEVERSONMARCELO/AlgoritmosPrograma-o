package A_P_LISTA_4_funções;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
     
      int n = leitor("Número int positivo: ");
      int resul = somatoria(n);
    }
 
    public static int leitor(String msg) {

        Scanner leitor = new Scanner(System.in);
        boolean valido ;
        int n = 0;
        do {
            try {

                System.out.print(msg);
                n = Integer.parseInt(leitor.nextLine());
                if (n >= 1) {
                    valido = true;
                } else {
                    System.err.println("NÚMERO DEVE SER >= 1\n --TENTE NOVAMENTE--\n");
                    valido = false;
                }
            } catch (NumberFormatException ex) {
                System.err.println("Número ou caracter inválido " + ex + "\n --TENTE NOVAMENTE--\n");
                valido = false;
            }
        } while (!valido);
        return n; 
    }
    public static int somatoria(int a) {
        
        int soma = 0, n = a, i = 1;
        
        while (i <= n) {
            soma += i;
            i++;
        }
        System.out.println("A somatoria é: "+soma);
        return soma;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
