package A_P_Aula_07_repetição;

import java.util.Scanner;

/**
Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha,
inclusive o X, se for o caso. Use o laço for.
 */
public class Exerc_02 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int x, i, impar;

        System.out.print("Número inteiro: ");
        x = leitor.nextInt();
//falta exibir apenas os impares        
        for (i = 0; i < x;) {
            i = i + 1;

            System.out.println(i);
            
        } 
    }
}
