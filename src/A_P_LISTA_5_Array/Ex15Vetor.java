package A_P_LISTA_5_Array;

public class Ex15Vetor {

    public static void main(String[] args) {
    
        int t = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
        int[] cria = Ex1Vetor.criaVetor(t);
        int[] popula = Ex1Vetor.populaVetor(cria);
        verificaImprime(popula);
    }

    static void verificaImprime(int[] vetor) {
        System.out.println("\n--- VETOR ORDENADO EM ORDEM CRESCENTE ---\n");
        //  Arrays.sort(v);//ordena vetor em ordem crescente
        int aux;
        boolean continuaa;//controla se já estiver ordenado o if dentro do laço aninhado não é executado.

        for (int i = 0; i < vetor.length; i++) {
            continuaa = true;//
            for (int posição = 0; posição < (vetor.length -1); posição++) {//   -1 pois o contador posição começa em 0 

                if (vetor[posição] > vetor[posição + 1]) {
                    aux = vetor[posição];
                    vetor [posição] = vetor [posição +1];
                    vetor [posição +1] =aux;
                    continuaa = false;
                }
            }
            if (continuaa){
                break;
            }
        }//trocar os valores, de acordo com o tamanho do vetor, com uma variavel aux -- se vetor na primeira 
        //posição for maior que posição 2, então aux recebe primeira posição, e vetor posição 1 recebe posição 2
        //vetor posição 2 recebe aux.

        for (int t = 0; t < vetor.length; t++) {

            System.out.printf("Posição %d contém: %d", t, vetor[t]);
            System.out.println("");
        }
    }
}
