package RevisãoProva;

public class LaçosAninhados {

    public static void main(String[] args) {

        for (int h = 1; h <= 24; h++) { // 1º laço, contagem irá terminar enquanto este laço for true

            for (int m = 1; m <= 60; m++) { // 2º laço

                for (int s = 1; s <= 60; s++) { // 3º laço
                    System.out.printf("%d: %d: %d \n", h, m, s);

                    if (h == 1 && m == 50 && s == 49) {
                        System.out.println("ALARME!!!");
                        break;
                    }
                }
                if (h == 1 && m == 50) {
                    break;
                }
            }
            if (h == 1) {
                break;
            }
        }
    }
}
