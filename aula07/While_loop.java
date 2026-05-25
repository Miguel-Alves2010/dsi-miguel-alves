package aula07;

public class While_loop {
    public static void main(String[] args) {

        // WHILE LOOP

        // O while serve para repetir um código
        // enquanto uma condição for verdadeira.
        
        // Nesse exemplo:
        // Enquanto o número for menor que 5,
        // o programa continuará repetindo.

        int i = 0;

        while(i < 5) {

            System.out.println(i);

            // O i++ soma +1 no valor de i.
            i++;
        }

        //_______________________________________________________________
        // DO / WHILE LOOP
        
        // O do/while é parecido com o while.
        // A diferença é:
        // o do executa o código PRIMEIRO,
        // e só depois verifica a condição.

        int j = 0;

        do {

            System.out.println("Valor de j: " + j);

            j++;

        } while(j < 5);

        //______________________________________________________________
        // Exemplo da vida real
        //contagem regressiva.

        int contador = 5;

        while(contador > 0) {

            System.out.println(contador);

            // O -- diminui 1 do valor.
            contador--;
        }

        System.out.println("Aeeee!");
    }
}
