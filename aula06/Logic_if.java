package aula06;

public class Logic_if {
    public static void main(String[] args) {
    int x = 2;

// && -> Vai resultar true apenas se ambas as declarações forem verdadeiras
// Nesse exemplo, existe a declaração que x é maior que cinco, e que x é menor que 1. Pelo fato do valor de x ser 2, ambas as declarações são falsas. Mas, se apenas uma fosse true, iria dar false.
System.out.println(x > 5 && x < 1);

// || -> Esse é diferente do &&, onde resultar true se apenas uma das declarações for verdadeira.
System.out.println(x >= 2 || x < 0); 

    }
}