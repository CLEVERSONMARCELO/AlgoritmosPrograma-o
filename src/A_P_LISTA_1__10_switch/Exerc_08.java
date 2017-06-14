package A_P_LISTA_1__10_switch;
import java.util.Scanner;
/**
Criar um programa para calcular o valor da multa a ser paga de anuidade de uma associação. 
* A anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de juros (com juros sobre juros). 
* Por exemplo, 
* uma associação de R$100 paga em janeiro, custa R$ 100; 
* em fevereiro, custa R$105; 
* em março, custa R$110,25; e, 
* em dezembro, R$171,03.
 */
public class Exerc_08 {
    public static void main (String[]args){
        Scanner leitor = new Scanner (System.in);

        int mesPagamento;
        double valorAnuidade, juros = 0.05;
        
        System.out.print("Digite o valor da anuidade: ");
        valorAnuidade = leitor.nextDouble();
        
        System.out.print("Digite o mês que foi pago a anuidade ex: 1 janeiro - 12 dezembro: ");
        mesPagamento = leitor.nextInt();
        
        double janeiro = valorAnuidade;
        double fevereiro = valorAnuidade+ (valorAnuidade*juros);
        double março = fevereiro+ (fevereiro*juros);
        double abril = março+ (março*juros);
        double maio = abril+ (abril*juros);
        double junho = maio+ (maio*juros);
        double julho = junho+ (junho*juros);
        double agosto = julho+ (julho*juros);
        double setembro = agosto+ (agosto*juros);
        double outrubro = setembro+ (setembro*juros);
        double novembro = outrubro+ (outrubro*juros);
        double dezembro = novembro+ (novembro*juros);
        
        switch (mesPagamento){
            case 1:
                System.out.printf("O valor a ser pago é %.2f",janeiro);
                break;
            case 2:
                System.out.printf("O valor a ser pago é %.2f",fevereiro);
                 break;
            case 3:
                System.out.printf("O valor a ser pago é %.2f",março);
                break;
            case 4:
                System.out.printf("O valor a ser pago é %.2f",abril);
                break;
            case 5:
                System.out.printf("O valor a ser pago é %.2f",maio);
                break;
            case 6:
                System.out.printf("O valor a ser pago é %.2f",junho);
                break;
            case 7:
                System.out.printf("O valor a ser pago é %.2f",julho);
                break;
            case 8:
                System.out.printf("O valor a ser pago é %.2f",agosto);
                break;
            case 9:
                System.out.printf("O valor a ser pago é %.2f",setembro);
                break;
            case 10:
                System.out.printf("O valor a ser pago é %.2f",outrubro);
                break;
            case 11:
                System.out.printf("O valor a ser pago é %.2f",novembro);
                break;
            case 12:
                System.out.printf("O valor a ser pago é %.2f",dezembro);
                break;
        }
    }
}