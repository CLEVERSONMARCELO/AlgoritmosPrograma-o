package Array;

import java.util.Scanner;

public class Verotes {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n = 5;//inicia a variável
        int[] v = new int[n];//inicia o vetor, com tamanho da variavel "n"

        for (int i = 0; i < n; i++) {//imput de valores no vetor "v" digitado pelo usuário

            System.out.printf("Digite o %d número: ",i+1);
            v[i] = leitor.nextInt();
        }

        int soma = 0;//variável acumuladora
        int menor = v[0];//comparação
        int maior = v[0];//comparação

        for (int i = 0; i < n; i++) {

            soma += v[i];

            if (v[i] < menor) {//verifica o menor valor digitado, e guarda este valor na variavel MENOR
                menor = v[i];
            }
                //pode usar a chave ou não. APENAS SE TIVER APENAS UMA LINHA DENTRO DO IF,  a chave pode ser abstraída
                if (v[i] > maior) {
                    maior = v[i];//verifica o menor valor digitado, e guarda este valor na variavel MAIOR
                }
            }

            //indica o tamanho
            for (int i = 0; i < n; i++) {
                System.out.print("v[" + i + "]:" + v[i]);

                if (v[i] == menor) 
                    System.out.print(" <---- MENOR");
                else if (v[i] == maior) 
                    System.out.print(" <---- MAIOR");
                
                System.out.println("");
            }

            System.out.println("A soma dor números digitados é: " + soma);
        
    }
}
