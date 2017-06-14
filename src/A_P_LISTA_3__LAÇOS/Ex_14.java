package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        double soma = 1, numero, deno = 1 ;
        //ENTRADA
        System.out.print("Número > 0: ");
        numero = Integer.parseInt(leitor.nextLine());
        
        //PROCESSAMENTO
        if (numero > 0 ){
        
        for ( double i = 2; i <= 6 * numero; i = i +2){
            
        deno += 2;
        
        soma += i /deno;
            
        }
        //SAÍDA
        System.out.print("Soma: "+soma);
        
        }else {
         System.err.print("Número inválido! ");       
        }
    }
}
