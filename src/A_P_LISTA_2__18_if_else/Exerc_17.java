package A_P_LISTA_2__18_if_else;
import java.util.Scanner;
/*

 */
public class Exerc_17 {
    public static void main (String[]args){
        int a,b,c,d;
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite um valor para A: ");
        a = leitor.nextInt();
        System.out.print("Digite um valor para B: ");
        b = leitor.nextInt();
        System.out.print("Digite um valor para C: ");
        c = leitor.nextInt();
        System.out.print("Digite um valor para D: ");
        d = leitor.nextInt();
        
        if (b>c&&d>a&&(c+d)>a&&(c+d)>b&&c>0&&d>0&&a % 2==0){
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores não aceitos");
        }
    }
}
