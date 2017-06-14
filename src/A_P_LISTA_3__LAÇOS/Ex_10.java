package A_P_LISTA_3__LAÇOS;

/*
Faça um programa que calcule e imprima o resultado da soma abaixo 
(lembre-se de que tanto as divisões quanto o resultado devem ser decimais).
Utilize o laço que lhe for mais conveniente. 
S = 1 +   +   +   + ... +   
 */
public class Ex_10 {
    public static void main(String[] args) {
        
        double soma = 1;
        
        for (int d = 2; d <= 20 ; d++){
            
         soma = soma + (1.0/d);    
            
        }
        
        System.out.print(soma);
    }
}
