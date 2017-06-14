package A_P_LISTA_2__18_if_else;

import java.util.Scanner;
/* Leia a hora inicial e a hora final de um jogo. 
  A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia 
  e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. 
  Veja abaixo alguns exemplos.  Não fixe esses valores no código. 
  Você pode usá­los para TESTAR seu algoritmo: 
 */
public class Exerc_16 {
    public static void main(String[]args){
       Scanner leitor = new Scanner (System.in); 
        
       int i, f, duracao;
       //entrada
        System.out.print("Digite a hora inicial do jogo : ");
        i = leitor.nextInt();
        System.out.print("Digite a hora final do jogo : ");
        f = leitor.nextInt();
        //processamneto
        duracao = i-f;
 
        if (duracao < 0) {

            duracao = duracao * (-1);
        } else {

            duracao = (duracao - 24) * (-1);
        }

        if (duracao == 0) {
            duracao = 24;
        }

        System.out.println("O jogo durou " + duracao + " horas");

    }
}
