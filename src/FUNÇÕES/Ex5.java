package FUNÇÕES;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        double a = leitor("Número real A: ");
        double b = leitor("Número real B: ");
        double c = leitor("Número real C: ");
        double delta = delta(a, b, c);
        double resul = báskara(delta, a, b, c);
        exiberesultado(resul);

    }

    static double leitor(String msg) {
        Scanner leitor = new Scanner(System.in);

        System.out.print(msg);
        double a = Double.parseDouble(leitor.nextLine());

        return a;
    }

    static double delta(double a, double b, double c) {

        double delta = Math.pow(b, 2) - (4 * a * c);

        return delta;
    }

    public static double báskara(double delta, double a, double b, double c) {

        double maior = 0;
        
        if (delta >= 0) {
            //soma
            double x1 = ((-b)+Math.sqrt(delta))/(2*a);
            //subtração        
            double x2 = ((-b)-Math.sqrt(delta))/(2*a);

            if (x1 > x2) {
                maior = x1;
            } else {
                maior = x2;
            }
        } else {
            maior = -1;
        }

        return maior;
    }

    public static void exiberesultado(double x) {

        if(x >0){
            System.out.println("Maior Raiz: "+x);
        }else{
        System.out.println(x);
        }
    }
    
    
    
}

   
        
        
        

    
    
    
    
    

