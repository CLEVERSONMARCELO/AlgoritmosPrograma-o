package A_P_LISTA_2__18_if_else;
import java.util.Scanner;
         /*Fazer um algoritmo que leia dois números L e R. 
        O programa deve verificar a maior área entre um
        quadrado de lado L e um círculo de raio R. 
        Imprimir na tela qual o maior: "Quadrado" ou "Circulo".
        */
public class Exerc_12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double l, r;
        String nome = "Quagrado tem área maior";
        String nome1 = "Cículo tem área maior ";

            //entrada
        System.out.print("Digite um número para um quadrado: ");
        l = leitor.nextDouble();
        System.out.print("Digite um número para um cículo: ");
        r = leitor.nextDouble();
            //processamneto
        l = Math.pow(l, 2);
        r = Math.PI * Math.pow(r, 2);
            //saída
        if (l > r) {
            System.out.print(nome + " com " + l + " m²");
        } else {
            System.out.print(nome1 + " com " + r + " m²");
        }

    }
}




    
    

