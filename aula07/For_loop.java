package aula07;

public class For_loop {
        public static void main(String[] args) {


        // FOR LOOP

        // O for também serve para repetição.

        // Ele é muito usado quando já sabemos
        // quantas vezes queremos repetir algo.

        // Estrutura do for:
        //
        // for(início; condição; aumento)

        for(int i = 0; i < 5; i++) {

            System.out.println(i);
        }

        // Explicando:
        //
        // int i = 0 -> começa no 0
        // i < 5 -> repete enquanto for menor que 5
        // i++ -> aumenta +1


        //________________________________________________________________
        // NESTED LOOPS

        // loop dentro de loop.

        for(int i = 1; i <= 2; i++) {

            System.out.println("Loop de fora: " + i);

            // Esse loop roda completamente
            // toda vez que o loop de fora repetir.

            for(int j = 1; j <= 3; j++) {

                System.out.println("Loop de dentro: " + j);
            }
        }

        //________________________________________________________________
        // FOR-EACH LOOP

        // O for-each é usado para percorrer arrays.
        // Array = lista de valores.

        String[] nomes = {"Carlos", "João", "Maria"};

        // O programa vai pegar cada nome
        // da lista e mostrar na tela.

        for(String nome : nomes) {

            System.out.println(nome);
        }

        //________________________________________________________________
        //Exemplo da vida real:

        // Exemplo simples:
        // mostrar uma tabuada.

        for(int i = 1; i <= 5; i++) {

            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}
