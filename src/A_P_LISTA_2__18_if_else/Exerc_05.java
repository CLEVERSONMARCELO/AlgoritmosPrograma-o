package A_P_LISTA_2__18_if_else;
import java.util.Scanner;
    public class Exerc_05 {
    /*
    Fazer um algoritmo que leia um valor L e calcula a 
    área de um quadrado de lado L.     
    */
    public static void main (String[] args){
     
        System.out.println("Digite um número para calcular \n"
                + "a área deste número");
        double n1, resultado;
        //Entrada
        Scanner leitor = new Scanner(System.in);
        n1 = leitor.nextDouble();

        //Processamento
        resultado = Math.pow(n1, 2);

        //Saída
        System.out.print("A área do número que você digitou é:  " + resultado);
}
}
