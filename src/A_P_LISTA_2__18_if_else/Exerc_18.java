package A_P_LISTA_2__18_if_else;
import java.util.Scanner;


public  class  Exerc_18 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double a, b, c,n1,n2,n3;
        System.out.print("Digite o valor de A: ");
        n1 = leitor.nextDouble();
        System.out.print("Digite o valor de B: ");
        n2 = leitor.nextDouble();
        System.out.print("Digite o valor de C: ");
        n3 = leitor.nextDouble();

        if ((n1 > n2) && (n1 > n3)) {
            a = n1;
            if (n2 > n3) {
                b = n2;
                c = n3;

            } else {
                b = n3;
                c = n2;
            }
        } else if ((n2 > n1) && (n2 > n3)) {
            a = n2;
            if (n1 > n3) {
                b = n1;
                c = n3;
            } else {
                b = n3;
                c = n1;
            }
        } else {
            a = n3;
            if (n1 > n2) {
                b = n1;
                c = n1;
            } else {
                b = n2;
                c = n2;
            }
        System.out.printf("n1:%.2f   n2: %.2f   n3:%.2f",a,b,c);

    }
    }}
