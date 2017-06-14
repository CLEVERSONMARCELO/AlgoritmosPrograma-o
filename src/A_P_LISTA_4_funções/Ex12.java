package A_P_LISTA_4_funções;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
     
    double altura = leitord("Altura: ");
    String sexo = leitor("Idade: ");
    double calculo = calcula(sexo, altura);
        imprime(calculo);
    
    }
    static double leitord(String msg) {
        Scanner leitor = new Scanner(System.in);
        System.out.print(msg);
        double altura = Double.parseDouble(leitor.nextLine());

        return altura;
    }
    
    static String leitor(String msg) {
        Scanner leitor = new Scanner(System.in);
        System.out.print(msg);
        System.out.print("M ou f:  ");
        String sexo = leitor.nextLine();
        sexo = sexo.toUpperCase();

        return sexo;
    }
    
    static double calcula(String sexo, double altura) {

        double pesoh = ((72.7 * altura) - 58);
        double pesom = ((62.1 * altura) - 44.7);

        double resultado = 0;

        if (sexo.equals("M")) {
            resultado = pesoh;
        } else if (sexo.equals("F")) {
            resultado = pesom;
        }
        return resultado;
    }
    
    static void imprime (double resultado){
        
        System.out.printf("Seu peso ideal é: %.2f",resultado);
        System.out.println("\n");
    }
    
    
    
    
    
    
    
    
}