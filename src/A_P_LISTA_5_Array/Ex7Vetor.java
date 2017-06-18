package A_P_LISTA_5_Array;

public class Ex7Vetor {
    
    public static void main(String[] args) {
    
        int t = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
        int multiplicação = Ex1Vetor.leitorInteiro("Multiplicar cada elementos do vetor por: ");
        int [] vetor = cria(t);
        int v = populaMultiplica(multiplicação, vetor);
        imprime(multiplicação, v);
    }

    static int [] cria (int t){
        
        int [] vetor = new int [t];
        return vetor;
    }
    
    static int populaMultiplica (int mult,int [] vetor){
        System.out.println("");
        
        int soma = 0;
        
        for(int i = 0; i < vetor.length; i++){
            
            System.out.printf("Posição %d do vetor recebe: ",(i+1));
            vetor [i] = Ex1Vetor.leitor2SemMsg();
            
            soma+= vetor[i];
        }
        
        int multiP = soma *mult;
     
        return multiP;
    }
 
    static void imprime (int multiplica,int multiP){
        System.out.println("");
        System.out.printf("A multipliacação de cada elemento do vetor por %d é: %d ",multiplica, multiP);
        
    }
}
