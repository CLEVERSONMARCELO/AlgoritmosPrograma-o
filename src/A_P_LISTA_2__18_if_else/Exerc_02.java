/*
 Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
Math.pow(5, 3) . Você pode trocar esses números por variáveis.

 */
package A_P_LISTA_2__18_if_else;

import java.util.Scanner;

public class Exerc_02 {

    public static void main(String[] args) {

        double n1, b1, resultado;
        //entrada
        System.out.println("Cálcular a exponenciação: ");
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do número base:  ");
        n1 = leitor.nextInt();

        System.out.println("Digite o valor do expoente: ");
        b1 = leitor.nextInt();

        //processamento 
        resultado = Math.pow(n1, b1);

        //Saída
        System.out.println("O resultado é:  " + resultado);

    }
}
