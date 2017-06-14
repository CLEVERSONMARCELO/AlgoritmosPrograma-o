package A_P_LISTA_2__18_if_else;
import java.util.Scanner;
/**
 Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total 
 de vendas efetuadas por ele no mês (em dinheiro). 
 Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
 efetuadas, calcular e imprimir o total a receber no final do mês. 
 */
public class Exerc_10 {
    public static void main (String[] args){
        
        Scanner leitor = new Scanner(System.in);

        double s, tvendas, c, sfinal;

        System.out.println("Calcular sálario do vendedor (sálario fixo+comissão) ");
        //ENTRADA
        System.out.println("Digite o sálario fixo do vendedor: ");
        s = leitor.nextDouble();
        System.out.println("Digite o valor total de vendas efetuadas: ");
        tvendas = leitor.nextDouble();
        //PROCESSAMENTO
        c = tvendas * 0.15;
        sfinal = c + s;
        //SAÍDA
        System.out.println("O sálario final do vendedor é R$: " + sfinal);
    }
}
