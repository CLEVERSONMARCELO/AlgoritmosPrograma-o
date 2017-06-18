package A_P_LISTA_5_Array;

public class Ex6Vetor {

    public static void main(String[] args) {

        int t = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
        int[] v = cria(t);
        int [] p = popula(v);
        imprime(p);
        
    }
    static int[] cria(int t) {
        int[] vetor = new int[t];
        return vetor;
    }

    static int[] popula(int[] vetor) {
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor recebe: ",(i+1));
            vetor[i] = Ex1Vetor.leitor2SemMsg();
        }
        System.out.println(" ");
        return vetor;
    }

    static void imprime(int[] populado) {

            int produto = 1;

            for (int i : populado) {

                produto *= i;
            }
            System.out.printf("O produto dos elementos do vetor é: %d", produto);
            System.out.println("");
        }
    }//class
