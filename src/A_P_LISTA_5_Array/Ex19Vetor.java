package A_P_LISTA_5_Array;

public class Ex19Vetor {

    public static void main(String[] args) {

        int t = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
        int[] v = Ex1Vetor.criaVetor(t);
        int[] popula = Ex1Vetor.populaVetor(v);
        imprime(popula);
    }

    static void imprime(int[] popula) {
        System.out.println("");
        
        for (int i = 0; i < popula.length; i = i + 2) {

            System.out.println("Posição impar "+(i+1)+" :  " + popula[i]);
        }
    }
}
