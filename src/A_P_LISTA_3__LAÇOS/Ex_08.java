/*
Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73.
​Utilize o laço que lhe for mais conveniente. 
 */
package A_P_LISTA_3__LAÇOS;

public class Ex_08 {

    public static void main(String[] args) {

        int soma = 0, contagem = 0, media = 0;

        for (int i = 13; i <= 73; i++) {

            int par = i % 2;

            if (par == 0) {

                soma = soma + i;

                contagem = contagem + 1;
            }

        }

        media = soma / contagem;
        System.out.println("Soma dos números pares:  "+soma);
        System.out.println("Soma total dos pares:  "+contagem);
        System.out.println("Média:  "+media);

    }
}
