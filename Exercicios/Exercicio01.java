package Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = input.nextLine();

        System.out.println("Digite a idade: ");
        int idade = input.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double horas = input.nextDouble();

        System.out.println("Qual o valor recebido por hora?: ");
        double valorHora = input.nextDouble();

        System.out.println("Possui filhos com idade inferior a 14 anos? (true/false): ");
        boolean filhos = input.nextBoolean();

        int qtdFilhos = 0;
        double salarioFtotal = 0;

        if (filhos == true) {
            System.out.println("Quantos filhos possuem idade inferior a 14 anos?: ");
            qtdFilhos = input.nextInt();

            System.out.println("Qual o salário familiar?: ");
            salarioFtotal = input.nextDouble();
        }

        System.out.println("Qual o tempo de serviço em anos?: ");
        double tempoServico = input.nextDouble();


        double salarioBruto = horas * valorHora;

        double descontoInps = salarioBruto * 8.5 / 100;


        double impostoRenda = 0;

        if (salarioBruto > 1500) {
            impostoRenda = salarioBruto * 15 / 100;
        } 
        else if (salarioBruto > 500) {
            impostoRenda = salarioBruto * 8 / 100;
        } 
        else {
            impostoRenda = 0;
        }

        double adicional = 0;

        if (idade > 40) {
            adicional = salarioBruto * 2 / 100;
        } 
        else if (tempoServico > 15) {
            adicional = salarioBruto * 3.5 / 100;
        } 
        else if (tempoServico <= 15 && tempoServico > 5 && idade > 30) {
            adicional = salarioBruto * 1.5 / 100;
        } 
        else {
            adicional = 0;
        }

        double totalDescontos = descontoInps + impostoRenda;

        double salarioLiquido = salarioBruto - totalDescontos + salarioFtotal + adicional;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Horas trabalhadas: " + horas);
        System.out.println("Valor recebido por hora: " + valorHora);
        System.out.println("Tempo de serviço: " + tempoServico);

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto do INPS: R$ " + descontoInps);
        System.out.println("Imposto de renda: R$ " + impostoRenda);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário família: R$ " + salarioFtotal * qtdFilhos);
        System.out.println("Adicional: R$ " + adicional);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}