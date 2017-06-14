package Array;

import java.util.Random;

public class Array_2ºFomardeIniciar {
    public static void main(String[] args) {
        //OUTRO MODE DE INICIALIZAR O VETOR
        int [] numeros = {1,2,3};
        
        for (int i = 0; i < 3; i++){
        //MODIFICA OS VALORES DAS POSIÇÕES DO VETOR
            numeros [i] = i * 2;
        }
        for (int i = 0; i < 3; i++){
        //IMPRIME AS POSIÇÕES CONDITAS NO VETOR
            System.out.println(numeros[i]); 
        }
    }
}
