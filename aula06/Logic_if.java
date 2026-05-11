package aula06;

public class Logic_if {
    public static void main(String[] args) {

    int x = 2;

    // && -> Vai resultar true apenas se ambas as declarações forem verdadeiras
    // Nesse exemplo, existe a declaração que x é maior que cinco, e que x é menor que 1.
    // Pelo fato do valor de x ser 2, ambas as declarações são falsas.
    // Mas, se apenas uma fosse true, iria dar false.
    System.out.println(x > 5 && x < 1);

    // || -> Esse é diferente do &&, onde resultará true se apenas uma das declarações for verdadeira.
    System.out.println(x >= 2 || x < 0);

    // ! -> Inverte um valor lógico
    // Se o resultado for true, ele vira false. Se for false, vira true.
    System.out.println(!(x > 5));



    // IF -> O if executa um bloco de código apenas se a condição for verdadeira.
    // Nesse exemplo, x é igual a 2, então a mensagem será exibida.
    if (x == 2) {
        System.out.println("x é igual a 2");
    }

    // ELSE -> O else executa um bloco de código caso a condição do if seja falsa.
    // Como x não é maior que 5, o else será executado.
    if (x > 5) {
        System.out.println("x é maior que 5");
    } else {
        System.out.println("x não é maior que 5");
    }

    // IF e ELSE usando operadores lógicos
    // Nesse exemplo, ambas as condições precisam ser verdadeiras por causa do &&.
    if (x > 0 && x < 5) {
        System.out.println("x está entre 0 e 5");
    } else {
        System.out.println("x não está entre 0 e 5");
    }

    }
}