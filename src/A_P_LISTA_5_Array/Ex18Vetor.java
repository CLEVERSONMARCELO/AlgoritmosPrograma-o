package A_P_LISTA_5_Array;

public class Ex18Vetor {
    public static void main(String[] args) {
        
      int t = Ex9Vetor.leitor("Tamanho do vetor? ");
      int v = Ex9Vetor.leitor("Número inteiro: ");
      int[] vetor = Ex9Vetor.cria(t);
      int [] populaVetor = Ex9Vetor.popula1(vetor);
        imprime(vetor, v);
        
    }
    static void imprime(int[] vetor, int v) {
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] == v) {
                System.out.printf("Posição %d do vetor contém: %d  ", (i+1), vetor[i]);
                System.err.print("<-------Número inteiro está nesta posição");
            }
        }
    }
}
    
    
    

