package A_P_Aula_06_Switch;

import java.util.Scanner;

public class AP_Case_aula06 {
    
    public static void main (String[]args){
        //declara variável para comparação
        char nomedavariavel = 'a';
        //
        switch(nomedavariavel){
            //teste serão realizados até programa encontra case verdadeiro!
            case 'a':
            System.out.print("Excelente!");
            break;//comentário
            case 'b':
            case 'c':
            System.out.print("bem feito!");;
            break;
            case 'd':
            System.out.print("você passou!");
            break;
            case 'e':
            System.out.print("Melhor tentar novamente!");
            break;
            default:
            System.out.print("conceito inválido!");
        }
    }
}

