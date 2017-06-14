package A_P_LISTA_4_funções;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        int a = leitor("1º NÚMERO INTEIRO: ");
        int b = leitor("2º NÚMERO INTEIRO: ");
        int c = leitor("3º NÚMERO INTEIRO: ");
        int m = verifica(a, b, c);
        exibiMaior(m);

    }
    public static int leitor(String mensagem) {
       boolean valido;
       int a = 0;
       do{
        try{
        Scanner leitor = new Scanner(System.in);
        System.out.print(mensagem);
        a = Integer.parseInt(leitor.nextLine());
        valido = true;
        }catch (NumberFormatException msg){
            System.err.println("Número inválido ou caracter "+msg+"\n --TENTE NOVAMENTE--\n");
            valido =false;
        }
       }while(!valido); 
       return a;
    }
    public static int verifica(int a, int b, int c) {

        int menor = 100;

        if (a < b && a < c) {
            menor = a;
        } else if (b < a && b < c) {
            menor = b;
        } else if (c < a && c < b) {
            menor = c;
        }
        return menor;
    }
    public static void exibiMaior(int menor) {
        System.out.print("O menor número digitado é: " + menor);
    }
}
