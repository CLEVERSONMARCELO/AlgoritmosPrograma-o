package A_P_LISTA_5_Array;

public class Ex17Vetor {
        
    public static void main(String[] args) {

        int t = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
        System.out.print("Multiplicar cada elementos do vetor por: ");
        double numero = Ex2Vetor.leitor2double();
        double[] vetor = Ex10Vetor.cria(t);
        double[] popula = popula(vetor);
        imprime(popula, numero);
    }

    static double[] popula(double[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("");
            System.out.printf("Posição %d do vetor recebe: ", i);
            vetor[i] = Ex2Vetor.leitor2double();
        }
        return vetor;
    }
    
    static void imprime (double [] popula, double numero ){
        System.out.println("");
        double soma = 0;
        
        for (int i = 0; i < popula.length; i++){
           
            soma += popula[i]*numero;
        }
        System.out.println("O resultado da soma é: "+ soma);
    }
}
