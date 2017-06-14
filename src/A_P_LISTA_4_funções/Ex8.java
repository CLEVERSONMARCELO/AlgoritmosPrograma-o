package A_P_LISTA_4_funções;

public class Ex8 {
    public static void main(String[] args) {
      
        int numero = Ex5.recebe("Número:  ");
        boolean p = verifica(numero);
        imprimir(numero, p);
    }
    
    static boolean verifica(int numero) {

        int cont = 0;
        boolean primo;

            for (int i = 1; i <= numero; i++) {

                if (numero % i == 0) {
                    cont++;
                }
            }
        primo = (cont == 2);
        
        return primo;
    }
    static void imprimir(int numero, boolean primo) {

        if (numero <= 0) {
            System.out.println("Número inválido");
            
        } else if (primo) {
            System.out.println("Verdadeiro");
            
        } else {
            System.out.println("Falso");
        }
    }
}
