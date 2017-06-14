package Exercicios_entregar06_06;
public class Ex2 {

    public static void main(String[] args) {
     
        int tamanho = Ex1.tamanho();
        int criaMatrz [][] = Ex1.criamatriz(tamanho);
        int popula [] [] = Ex1.populamatriz2(criaMatrz);
        System.out.println("\n");
        Ex1.impriSoma(popula);
        imprimeTranposta(popula);
        
    }
    static void imprimeTranposta (int [] [] popula){
        
        System.out.println("--- MATRIZ TRANSPOSTA ---\n");
        
        for (int i = 0; i < popula.length; i++){
            for (int j = 0; j < popula[i].length; j++){
                
            System.out.print(popula [j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}
