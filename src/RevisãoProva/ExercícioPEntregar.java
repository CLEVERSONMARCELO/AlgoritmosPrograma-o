package RevisãoProva;

import java.util.Scanner;

public class ExercícioPEntregar {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        boolean parar = true;

        System.out.println("------DESPERTADOR------\n");

        int diadasemana, data, hora, minuto, segundos;
        //ENTRADA

        while (parar) {

            System.out.print("1 - para DOMINGO: \n");
            System.out.print("2 - para SEGUNDA-FEIRA: \n");
            System.out.print("3 - para TERÇA-FEIRA: \n");
            System.out.print("4 - para QUARTA-FEIRA: \n");
            System.out.print("5 - para QUINTA-FEIRA: \n");
            System.out.print("6 - para SEXTA-FEIRA: \n");
            System.out.print("7 - para SÁBADO: \n\n");
            System.out.print("ESCOLHA O DIA DA SEMANA: ");
            diadasemana = leitor.nextInt();

            System.out.print("Hora: ");
            hora = leitor.nextInt();

            System.out.print("Minuto: ");
            minuto = leitor.nextInt();

            System.out.print("Segundos: ");
            segundos = leitor.nextInt();
            //PROCESSAMENTO

            for (int d = 1; d <= 7; d++) {

                for (int h = 0; h <= 23; h++) {

                    for (int m = 0; m <= 59; m++) {

                        for (int s = 0; s <= 59; s++) {
                            System.out.printf("Dia %d  %d: %d: %d: \n", d, h, m, s);

                            if (d == diadasemana && h == hora && m == minuto && s == segundos) {
                                System.out.print("------------ALARME------------\n");
                                break;

                            }
                        }
                        if (d == diadasemana && h == hora && m == minuto) {
                            break;
                        }
                    }
                    if (d == diadasemana && h == hora) {
                        break;
                    }
                }
                if (d == diadasemana) {
                    break;

                }
            }

            System.out.print(" 1 -  SIM\n 2 -  NÃO  \n\n CONTINUAR?");
            if (leitor.nextInt() == 2) {
                parar = false;

            }
        }
    }
}
