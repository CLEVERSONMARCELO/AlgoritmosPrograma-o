package Array;

public class Array_CriarPercorrer {
    //CRIAR ARRAY COM NÚMERO DE POSIÇÕES DETERMINADAS
    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
    //INICIALIZA CADA POSIÇÃO DO VETOR COM UM VALOR
            numeros[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
    //PERCORRE O VETOR E IMPRIME OS VALORTE DE CADA POSIÇÃO
            System.out.println(numeros[i]);
        }
    }
}
