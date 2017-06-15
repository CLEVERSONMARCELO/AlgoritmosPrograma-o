package A_P_LISTA_5_Array;

public class Ex20Vetor {
    public static void main(String[] args) {
   
    int t = Ex9Vetor.leitor("Tamanho do vetor: ");
    int[] v = Ex9Vetor.cria(t);
    System.out.println("Vetor 1");
    int[] popula = Ex1Vetor.populaVetor(v);
    int tamanhoVetor3 = tamanhoV3(popula);
    int[] vetor3 = Ex9Vetor.cria(tamanhoVetor3);
    
    int [] populaV3 = populaV3(popula, vetor3);
        ImprimirVetor3(populaV3);
    
    
    }
    static int tamanhoV3(int[] popula) {
        System.out.println("");

        int cont = 0;

        for (int i = 0; i < popula.length; i++) {

            if ((popula[i] % 3) == 0) {
                
                cont++;
            }
        }
        return cont;
    }

    static int[] populaV3(int[] popula, int[] vetor3) {

        for (int i = 0; i < popula.length; i++) {

            if ((popula[i] % 3) == 0) {
                    
                vetor3[i] = popula[i];
                
            }
        }
        return vetor3;
    }
    
    static void ImprimirVetor3(int[] vetor3) {
        System.out.println("Vetor 2");
        for (int i = 0; i < vetor3.length; i++) {
            
            System.out.printf("Posição %d do vetor contém: %d",(i+1),vetor3[i]);
            System.out.println("");
        }
        System.out.println("-----Posições impares-----");
         for (int i = 0; i < vetor3.length; i =i+2) {
            
            System.out.printf("Posição impar %d do vetor contém: %d",(i+1),vetor3[i]);
            System.out.println("");
        }
        
        
        
        
        
        
        
        
        
        
    }
}//class
