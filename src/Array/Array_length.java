package Array;

public class Array_length {

    public static void main(String[] args) {
        //QUANDO O TAMANHO DO VETOR É MODIFICADO NA SUA INICIALIZAÇÃO, O TAMANHO TBM É TROCADO NOS DEMAIS LAÇOS
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
        //UTILIZAR O ATRIBUTO LENGTH   (NomeDaVariável . LENGTH
            numeros[i] = i +1;
        }
        for (int i = 0; i < numeros.length; i++) {
        //UTILIZAR O ATRIBUTO LENGTH   (NomeDaVariável . LENGTH
            System.out.println(numeros[i]);
        }
    }
}
