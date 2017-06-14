package A_P_LISTA_4_funções;

public class Ex13 {
    public static void main(String[] args) {
        
     int numero = Ex9.leitor("Inteiro positivo: ");
     int dividores = divisores(numero);
        imprime(dividores);
     
     
    }
    static int divisores (int numero){
        
        int cont = 0;
        
      for (int i = 1; i <= numero; i++){
          
         if ((numero % i)==0 ){
             cont = cont+1;
             System.out.println("Divisores: "+i);
         }
      }
    return cont;
    }
    static void imprime (int cont){
        System.out.println("O número total de divisores é: "+cont);
        System.out.println("\n");
    }
}
