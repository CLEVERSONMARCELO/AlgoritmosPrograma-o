package A_P_LISTA_5_Array;

public class Ex19Vetor {
    public static void main(String[] args) {
        
      int t = Ex9Vetor.leitor("Tamanho do vetor? ");
      int[] vetor = Ex9Vetor.cria(t);
      int [] populaVetor = Ex18Vetor.populaVetor(vetor);
        imprime(populaVetor, vetor);
        
    }
    static void imprime(int[] populavetor, int[] vetor) {

        for (int i = 0; i < populavetor.length; i =i+2) {
            
            System.out.println("Posições impares do vetor contém: "+populavetor[i]);
            
            }
        }
    }

/*for (int j = 0; j < vetor.length; j++) {

                if ((vetor[i]%2)==0){
                    System.out.println(populavetor[i]);
                }*/
