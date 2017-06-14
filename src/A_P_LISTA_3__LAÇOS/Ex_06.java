/*
Faça um programa para ler e escrever dados de uma turma de 5 alunos. 
O programa deve pedir dados como nome, idade e sexo. 
O programa deve imprimir os dados do aluno mais velho. ​Use o laço DO-WHILE.
 */
package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int i = 1, idade, maior = 0;

        String nome, sexo, nmaior = null, smaior = null;

        do {

            System.out.print("Nome " + i + "º aluno: ");
            nome = leitor.nextLine();

            System.out.print("sexo " + i + "º aluno M ou F: ");
            sexo = leitor.nextLine();

            System.out.print("idade " + i + "º aluno: ");
            idade = Integer.parseInt(leitor.nextLine());
            System.out.print(" \n");

            i++;

            if (idade > maior) {
                maior = idade;
                nmaior = nome;
                smaior = sexo;
            }

        } while (i <= 2);

        System.out.print("O aluno (a) mais velho (a) é "+nmaior.toUpperCase() +",  com "+ maior+ 
                " anos de idade,  do sexo "+smaior.toUpperCase()+" ");
    }
}
