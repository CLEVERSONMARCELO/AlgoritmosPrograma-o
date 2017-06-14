package A_P_LISTA_4_funções;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
      
        int mesAtual = leitor("Mês atual: ");
        int diaAtual = leitor("Dia atual: ");
        int idadeAnos = leitor("Idade em anos: ");
        int MesNasc = leitor("Mês nascimento: ");
        int diaNasc = leitor("Dia nascimento: ");
        int soma  = soma(mesAtual, diaAtual, idadeAnos, MesNasc, diaNasc);
        imprime(soma);
    }
    static int leitor (String msg){
      Scanner leitor = new Scanner(System.in);
        System.out.print(msg);
        int n = Integer.parseInt(leitor.nextLine());
        return n;
    }
    
    static int soma (int mesAtual, int diaAtual, int idadeAnos, int MesNasc, int diaNasc ){
       int  soma = ((idadeAnos *365))+((mesAtual - MesNasc)*30)+((diaAtual - diaNasc));
        return soma;
    }
    
    static void imprime (int soma){
        
        System.out.println("Dias que está vivendo: " + soma);
    }
}

