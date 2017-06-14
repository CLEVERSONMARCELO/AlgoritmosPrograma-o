package A_P_LISTA_4_funções;

public class Ex10 {

    public static void main(String[] args) {

        int idade = Ex9.leitor("Idade do nadador: ");
        String categoria = categoria(idade);
        imprime(categoria);

    }

    static String categoria(int idade) {

        String categoria = null;

        if (idade >= 5 && idade <= 7) {
            categoria = "INFANTIL A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "INFANTIL B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "JUVENIL C";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "JUVENIL D";
        } else if (idade >= 18) {
            categoria = "ADULTO";
        } else if (idade < 5) {
            System.err.println("Categotia inválida");
        }
        return categoria;
    }

    static void imprime(String categotia) {

        System.out.println("A categoria do nadador é: " + categotia);
    }

}
