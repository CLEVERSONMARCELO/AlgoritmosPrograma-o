package A_P_LISTA_1__10_switch;
import java.util.Scanner;
/**
 Construir um programa para identiﬁcar quantos dias há em um mês, sabendo o mês e o ano. 
 */
public class Exerc_04 {
  public static void main  (String[]args){
     Scanner leitor = new Scanner (System.in);
     
      int mes, ano;

      double bi;

      System.out.print("Digite o ano: ");
      ano = leitor.nextInt();

      System.out.print("Digite um mês, ex: 1 para janeiro - 12 para dezembro:  ");
      mes = leitor.nextInt();

      bi = ano % 4;

      switch (mes) {
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12:
              System.out.print("O mês " + mes + " tem 31 dias");
              break;
          case 2:

              if (bi == 0) {
                  System.out.print(" Ano bissexto, mês 2 tem 29 dias");
              } else {
                  System.out.print("mês 2 tem 28 dias");
              }
              break;
          case 4:
          case 6:
          case 9:
          case 11:
              System.out.print("O mês " + mes + " tem 30 dias");
              break;

          default:
              System.out.print("Mês digitado inválido!");
        } 
    }
}
     
  