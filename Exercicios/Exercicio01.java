package Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        //Nome
        System.out.println("Digite o nome: ");
        String nome = input.nextLine();

        //idade
        System.out.println("Digite a idade: ");
        int idade = input.nextInt();

        //Horas trabalhadas
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horas = input.nextInt();

        //valor que recebe por hora
        System.out.println("Qual o valor recebido por hora?: ");
        double valor = input.nextDouble();

        //filhos
        System.out.println("Possui filhos?(true/false): ");
        boolean filhos = input.nextBoolean();

        if (filhos == true) {
            System.out.println("Quantos possuem idade inferior a 14? ");
            int qtdfilhos = input.nextInt();

            familia = qtdfilhos * 50;

        }

        //Tempo de serviço
        System.out.println("Qual o tempo de serviço?: ");
        float tmpServico = input.nextFloat();


        //Prints 😊👌
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Horas por dia: " + horas);
        System.out.println("Valor recebido por hora: " + valor);
        System.out.println("Tempo de serviço: " + tmpServico);

        if (filhos == true){
            System.out.println("O salário familiar é, considerando 50 reais para cada filho com menos de 14 anos, de: " + qtdfilhos * 50);
        }

    }
}