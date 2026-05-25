package aula07;

public class Break_continue {
        public static void main(String[] args) {


        // BREAK

        // O break serve para PARAR o loop.
        //
        // Quando o programa encontrar o break,
        // ele sai do loop imediatamente.

        for(int i = 0; i < 10; i++) {

            // Quando i for igual a 4:
            if(i == 4) {

                break;
            }

            System.out.println(i);
        }

        // O resultado será:
    
        // 0
        // 1
        // 2
        // 3
        
        // Porque o loop parou no 4.

        //______________________________________________________________
        // CONTINUE

        // O continue é diferente.
        //
        // Ele NÃO para o loop.
        // Ele apenas pula UMA repetição.

        for(int i = 0; i < 10; i++) {

            // Quando i for igual a 4:
            if(i == 4) {

                // Pula essa repetição.
                continue;
            }

            System.out.println(i);
        }

        // O número 4 não aparecerá,
        // mas o loop continuará normalmente.
    }
}
