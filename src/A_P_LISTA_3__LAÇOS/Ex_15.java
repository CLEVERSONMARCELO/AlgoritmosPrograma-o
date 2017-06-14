package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        
        Scanner leitor = new  Scanner (System.in);
        
        int numero, subtração;
        
        //ENTRADA
        System.out.print("Numero > 0: ");
        numero = Integer.parseInt(leitor.nextLine());
        
        double f = numero;
        
        //PROCESSAMENTO
        for (int i = numero; i > 1 ; i-- ){
            
        subtração  = i - 1;
        
        f  *= subtração;

        }
        //SAÍDA
        System.out.println("Fatorial: "+f);
    }
}
