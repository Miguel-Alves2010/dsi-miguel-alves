package Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código do funcionário: ");
        int codigo = input.nextInt();

        System.out.println("Digite o sexo do funcionário:");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        int sexo = input.nextInt();

        System.out.println("Digite o tempo de trabalho em anos: ");
        int tempoServico = input.nextInt();

        System.out.println("Digite o salário: ");
        double salario = input.nextDouble();

        double bonus = 0;

        if (sexo == 1 && tempoServico > 15) {
            bonus = salario * 20 / 100;
        } 
        else if (sexo == 2 && tempoServico > 10) {
            bonus = salario * 25 / 100;
        } 
        else {
            bonus = 100;
        }

        double salarioFinal = salario + bonus;

        System.out.println("Código do funcionário: " + codigo);
        System.out.println("Salário original: R$ " + salario);
        System.out.println("Bônus recebido: R$ " + bonus);
        System.out.println("Salário com bônus: R$ " + salarioFinal);
    }
}