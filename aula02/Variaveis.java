package aula02;

public class Variaveis {

    public static void main(String[] args) {
        String msgPt1 = "Ola ";
        String msgPt2 = "Alunos";
        System.out.println(msgPt1.concat(msgPt2)); //Concatenar, ou seja, juntar ambos. Concatenar, em um exemplo facil, no caso de um int + string, iria juntar ambos, como "1 + 1 = 11"

        int n1 = 1;
        String n2 = "2";
        System.out.println(n1 + Integer.parseInt(n2)); //Para somar um int com uma string
    }
}