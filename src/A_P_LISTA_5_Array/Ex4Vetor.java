<?xml version="1.0" encoding="UTF-8"?>
<project-private xmlns="http://www.netbeans.org/ns/project-private/1">
    <editor-bookmarks xmlns="http://www.netbeans.org/ns/editor-bookmarks/2" lastBookmarkId="0"/>
    <open-files xmlns="http://www.netbeans.org/ns/projectui-open-files/2">
        <group>
            <file>file:/F:/PROJETOS%20NETBEANS/Aula_01/src/A_P_LISTA_5_Array/Ex17Vetor.java</file>
        </group>
    </open-files>
</project-private>
                                                    ");
        return tamanho;
    }

    static int[] criaVetor(int tamanho) {

        int[] vetor = new int[tamanho];

        return vetor;
    }

    static int populaVerifica(int[] vetor) {

        int menor = 100;

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d do vetor recebe: ", i);
            vetor[i] = leitor.nextInt();

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    static void imprimeMenor(int menor) {

        System.out.println("O menor elemento do vetor é: " + menor);

    }

}
