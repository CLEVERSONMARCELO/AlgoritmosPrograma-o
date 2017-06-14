package A_P_LISTA_1__10_switch;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;
/**
Crie um programa que simule uma calculadora simples capaz de realizar as operações básicas.
* O programa deve receber 3 dados: dois números e um caractere. 
* Este caractere poderá ser '+', '-', ‘*' ou '/' , 
* e representarão a operação matemática que você deseja realizar entre os números. 

 */
public class Exerc_10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double n1, n2, soma, sub, div, mul;
        String operação;
        
        boolean i;
        
        do {
        //ENTRADA
        System.out.print("Qual operação será realizada? ");
        operação = leitor.nextLine();
        
        
        if (operação.equals("+") ||operação.equals("-") ||operação.equals("/") ||operação.equals("*")) {
           
            System.out.print("Digite o 1º número: ");
            n1 = Double.parseDouble(leitor.nextLine());

            System.out.print("Digite o 2º número: ");
            n2 = Double.parseDouble(leitor.nextLine());
            //PROCESSAMENTO
            soma = n1 + n2;
            sub = n1 - n2;
            div = n1 / n2;
            mul = n1 * n2;

            switch (operação) {

                case "+":
                    System.out.printf("Total %.2f\n", soma);

                    break;

                case "-":
                    System.out.printf("Total %.2f\n", sub);
                    break;

                case "/":
                    System.out.printf("Total %.2f\n", div);
                    break;

                case "*":
                    System.out.printf("Total %.2f\n", mul);
                    break;
                }
            break;
            
            } else {
                System.err.printf("-- OPERAÇÃO INVÁLIDA --\nTENTE NOVAMENTE\n");
               i = false; 
            }

        } while (!i);

    }
}
