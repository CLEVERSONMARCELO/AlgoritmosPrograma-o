package A_P_LISTA_2__18_if_else;
import java.util.Scanner;
/*Escreva um algoritmo que leia três números decimais: A, B e C. 
Em seguida, calcule e mostre:   
a) a área do triângulo retângulo que tem A por base e C por altura.  
b) a área do círculo de raio C. (π = 3.14159)   
c) a área do trapézio que tem A e B por bases e C por altura.   
d) a área do quadrado que tem lado B.   
e) a área do retângulo que tem lados A e B.  
f) o perímetro do retângulo que tem lados A e B. 
 */
public class Exerc_06 {
    public static void main (String[] args){
        
        double A,B,C,resulA,resulB,resulC,resulD,resulE,resulF;
        //ENTRADA
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite um valor para base A:  ");
        A = leitor.nextDouble();
        System.out.println("Digite um valor do para base B:  "); 
        B = leitor.nextDouble();
        System.out.println("Digite um valor do para altura C:  ");
        C = leitor.nextDouble();
        //PROCESSAMENTO
        System.out.print("A área do triângulo retângulo que tem A por base e C por altura é : ");
        resulA = (A*C)/2;
        System.out.println(resulA);
        
        System.out.print("A área do círculo de raio do valor C é: ");
        resulB =  Math.PI * Math.pow(C,2);
        System.out.println(resulB);
        
        System.out.print("A área do trapézio que tem A e B por bases e C por altura é: ");
        resulC = (A+B)*C/2;
        System.out.println(resulC);
        
        System.out.print("A área do quadrado que tem lado B é: ");
        resulD =  Math.pow(B, 2);
        System.out.println(resulD);
        
        System.out.print("A área do retângulo que tem lados A e B é: ");
        resulE = ((A+B)/2)*C;
        System.out.println(resulE);
        
        System.out.print("O perímetro do retângulo que tem lados A e B é: ");
        resulF = ((A*2+B*2)/2)+C*2;
        System.out.println(resulF);
  
            
    }
}
