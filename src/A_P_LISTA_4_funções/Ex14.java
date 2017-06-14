package A_P_LISTA_4_funções;

public class Ex14 {
    public static void main(String[] args) {
     
     int a  = Ex9.leitor("Valor de A: ");
     int n  = Ex9.leitor("Valor de N: ");
     int soma = soma(a, n);
        imprime(soma);
        
    }
    
    static int soma(int a, int n){
       
      if (n < 0){  
          
          return -1;
          
      }else{ 
          
       int soma = a;
            
        for (int i = 1; i < n; i++){
            
          soma += (i + a);
        }
        return soma;
      }
    }
    
    static void imprime (int soma){
        
        System.out.println("Resultado: "+ soma);
    }
    
    
    
    
    
    
    
    
}
