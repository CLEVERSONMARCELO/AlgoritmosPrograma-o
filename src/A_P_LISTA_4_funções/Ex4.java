package A_P_LISTA_4_funções;

public class Ex4 {

    public static void main(String[] args) {

        int numero = Ex1.leitor("Número int positivo:");
        double a = Ex3.fatorial(numero);
        int b = Ex2.somatoria(numero);
        exiveDivisao(a, b);

    }

    static void exiveDivisao(double a, int b) {

        System.out.println("\n\nO resultado é:  " + (a / b));
    }
}
