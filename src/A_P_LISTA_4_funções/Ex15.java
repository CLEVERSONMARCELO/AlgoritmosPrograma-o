package A_P_LISTA_4_funções;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
     
    int base = leitor("Base: ");
    int expoente = leitor("Expoente: ");
    double resultado = resul(base, expoente);
        imprime(resultado);
        
    }
    static int leitor (String msg){
       Scanner leitor = new Scanner(System.in); 
        System.out.print(msg);
        int base = Integer.parseInt(leitor.nextLine());
      return base;
    }
    
    static double resul(int b, int exp) {

        double result = 1;
        
        for (int i = 1; i <= exp ; i++){
            
            result *= b;
        }
        
        return result;

    }
    
    static void imprime (double result){
        
        System.out.println("Resultado: "+ result);
    }
}
