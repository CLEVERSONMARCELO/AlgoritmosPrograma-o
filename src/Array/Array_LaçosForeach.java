package Array;

public class Array_LaçosForeach {

    //PERCORRER POSIÇÕES SEM MODIFICAR O CONTEÚDO
    public static void main(String[] args) {

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = i + 1;
        }

        for (int recebe : numeros) {//à esquerda indica uma variável (QUALQUER UMA DO MESMO TIPO DO VETOR)
           // à direita contém referência do array/vetor  (NOME DO VETOR).

            System.out.println(recebe);

        }
    }
}
