package A_P_LISTA_5_Array;

import java.util.Arrays;

public class Ex15Vetor {

    public static void main(String[] args) {

        int t = Ex9Vetor.leitor("Tamanho do vetor: ");
        int[] cria = Ex9Vetor.cria(t);
        int[] popula = Ex8Vetor.popula(cria);
        verifica(popula);

    }

    static void verifica(int[] v) {

        //  Arrays.sort(v);//ordena vetor em ordem crescente
        int aux;
        boolean controle;//controla se já estiver ordenado o if dentro do laço aninhado não é executado.

        for (int i = 0; i < v.length; i++) {
            controle = true;//
            for (int j = 0; j < (v.length -1); j++) {

                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] =aux;
                    controle = false;
                }
            }
            if (controle){
                break;
            }
        }//trocar os valores, de acordo com o tamanho do vetor, com uma variavel aux -- se vetor na primeira 
        //posição for maior que posição 2, então aux recebe primeira posição, e vetor posição 1 recebe posição 2
        //vetor posição 2 recebe aux.

        for (int t = 0; t < v.length; t++) {

            System.out.printf("Posição %d contém: %d", t, v[t]);
            System.out.println("");
        }
    }
}
