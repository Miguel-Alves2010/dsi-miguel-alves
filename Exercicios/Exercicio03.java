package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o comprimento do lado A da forma: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Insira o comprimento do lado B da forma: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Insira o comprimento do lado C da forma: ");
        double ladoC = scanner.nextDouble();

        double maiorLado;
        double ladoMenor1;
        double ladoMenor2;

        if (ladoA >= ladoB && ladoA >= ladoC) {
            maiorLado = ladoA;
            ladoMenor1 = ladoB;
            ladoMenor2 = ladoC;
        }
        else if (ladoB >= ladoA && ladoB >= ladoC) {
            maiorLado = ladoB;
            ladoMenor1 = ladoA;
            ladoMenor2 = ladoC;
        }
        else {
            maiorLado = ladoC;
            ladoMenor1 = ladoA;
            ladoMenor2 = ladoB;
        }

        System.out.println("Valores lidos: " + ladoA + ", " + ladoB + ", " + ladoC);
        System.out.println("Maior lado: " + maiorLado);

        if (maiorLado >= ladoMenor1 + ladoMenor2) {
            System.out.println("Não é possível formar um triângulo com esses lados.");
        }
        else if (maiorLado * maiorLado == ladoMenor1 * ladoMenor1 + ladoMenor2 * ladoMenor2) {
            System.out.println("Formou um triângulo retângulo.");
        }
        else if (maiorLado * maiorLado > ladoMenor1 * ladoMenor1 + ladoMenor2 * ladoMenor2) {
            System.out.println("Formou um triângulo obtusângulo.");
        }
        else if (maiorLado * maiorLado < ladoMenor1 * ladoMenor1 + ladoMenor2 * ladoMenor2) {
            System.out.println("Formou um triângulo acutângulo.");
        }

        if (maiorLado < ladoMenor1 + ladoMenor2) {
            if (ladoA == ladoB && ladoA == ladoC) {
                System.out.println("Também formou um triângulo equilátero.");
            }
            else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Também formou um triângulo isósceles.");
            }
            else {
                System.out.println("Também formou um triângulo escaleno.");
            }
        }
    }
}