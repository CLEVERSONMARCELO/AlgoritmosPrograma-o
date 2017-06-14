package A_P_LISTA_4_funções;

public class Ex6 {
       public static void main(String[] args) {

        int a = Ex5.recebe("Valor de A: ");
        int b = Ex5.recebe("Valor de B: ");
        int c = Ex5.recebe("Valor de C: ");
        int op = Ex5.recebe("1 - Maior raiz 2- Menor raiz ");
        double raizmaior = raizmaior(a, b, c, op);
        double raizmenor = raizmenor(a, b, c, op);
           imprimir(raizmaior, raizmenor, op);
        
    }
    static double raizmaior(int a, int b, int c, int op) {

        double maior = 0;
        double delta = Math.pow(b, 2) - (4 * a * c);

        double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
        
        if (delta  >= 0 ){
        
        if (x1 > x2) {
            maior = x1;
        } else {
            maior = x2;
        }
        }else {
            System.out.println("Delta menou que zero \"-1\"");
        }
        return maior;
    }
    static double raizmenor(int a, int b, int c, int op) {

        double  menor = 0;
        double delta = Math.pow(b, 2) - (4 * a * c);

        double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
        
        if (delta  >= 0 ){
        
        if (x1 > x2) {
            menor = x2;
        } else {
            menor = x1;
        }
        }else {
            System.out.println("Delta menou que zero \"-1\"");
        }
        return menor;
    }
    static void imprimir(double raizmaior, double raizmenor, int op){
        switch (op){
            case 1: 
                System.out.println("Maior: "+raizmaior);
                break;
            case 2: 
                System.out.println("Maior: "+raizmenor);
                break;
        }
    }

}