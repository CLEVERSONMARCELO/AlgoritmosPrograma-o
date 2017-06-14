package A_P_LISTA_4_funções;

import java.util.Scanner;

public class Ex7 {
    
    public static void main(String[] args) {
     
        double numero = leitor("Medida da esfera: ");
        double resultado = calculo(numero);
        imprime(resultado);
    }
   
    static double leitor(String msg){
       
        Scanner leitor = new Scanner (System.in);
        
        System.out.print(msg);
        double numero = Double.parseDouble(leitor.nextLine());
        
      return numero;
    }
    
    static double calculo (double esfera ){
        
        double volume = (((4*Math.PI)*Math.pow(esfera, 3)) /3); 
       
        return volume;
    }
    
    static void imprime (double volume){
        
        System.out.printf("Volume é:  %.2f ", Math.abs(volume));
    }
}
