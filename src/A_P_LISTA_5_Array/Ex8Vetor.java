package A_P_LISTA_5_Array;

public class Ex8Vetor {

    public static void main(String[] args) {

        int t = Ex1Vetor.leitorInteiro("Tamanho do vetor: ");
        int numero = Ex1Vetor.leitorInteiro("Número inteiro: ");
        int[] cria = cria(t);
        int[] p = popula(cria);
        Verificaimprime(numero, p);
    }

    static int[] cria(int t) {

        int[] vetor = new int[t];

        return vetor;
    }

    static int[] popula(int[] vetor) {
        System.out.println("");

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor recebe: ", (i+1));
            vetor[i] = Ex1Vetor.leitor2SemMsg();
            System.out.println("");
        }
        return vetor;
    }

    static void Verificaimprime(int numero, int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] == numero) {
                System.out.printf("o número %d está presente no vetor", numero);
                System.out.println("");
                break;
            } else {
                System.err.printf("Número %d não está presente no vetor", numero);
                System.out.println("");
                break;
            }
        }

    }
}
