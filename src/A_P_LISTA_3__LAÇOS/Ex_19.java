package A_P_LISTA_3__LAÇOS;

import java.util.Scanner;

public class Ex_19 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int i = 1;
        String senha, senhaC = "2002";

        while (i <= 3) {
            //ENTRADA
            System.out.print("Digite sua senha: ");
            senha = leitor.nextLine();

            //SAÍDA 
            if (i == 3) {
                System.out.print("tentativas exedidas, bloqueado!!! ");
                
                //PROCESSAMENTO
                if (senha.equals(senhaC)) {
                    //SAÍDA   
                    System.out.print("SENHA CORRETA :) ");
                    break;

                }
            } //SAÍDA
            else {
                System.out.println("Senha incorreta, tente novamente... ");
            }
            i++;
        }
    }
}
