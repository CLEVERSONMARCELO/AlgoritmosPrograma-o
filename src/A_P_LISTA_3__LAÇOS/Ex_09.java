/*
Escreva um programa para ler a quantidade de alunos existentes em uma turma. 
Depois disso, o programa deve ler as notas de cada um destes alunos, 
calcular e mostrar na tela a média aritmética destas notas. Utilize o laço WHILE. 
 */
package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int i = 1;
        double nota, resultado = 0, soma = 0;

        System.out.print("Quantidade de alunos: ");
        int quant = leitor.nextInt();

        while (i <= quant) {

            System.out.print("Digite a nota do " + i + "º aluno: ");
            nota = leitor.nextInt();
            i++;

            soma = soma + nota;
            resultado = soma / quant;
        }
        System.out.print("A média de todos os alunos é: " + resultado);

    }
}
