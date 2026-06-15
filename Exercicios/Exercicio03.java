package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o lado A: ");
        double ladoA = input.nextDouble();

        System.out.println("Digite o lado B: ");
        double ladoB = input.nextDouble();

        System.out.println("Digite o lado C: ");
        double ladoC = input.nextDouble();

        double originalA = ladoA;
        double originalB = ladoB;
        double originalC = ladoC;

        double x;

        if (ladoA < ladoB) {
            x = ladoA;
            ladoA = ladoB;
            ladoB = x;
        }

        if (ladoA < ladoC) {
            x = ladoA;
            ladoA = ladoC;
            ladoC = x;
        }

        if (ladoB < ladoC) {
            x = ladoB;
            ladoB = ladoC;
            ladoC = x;
        }

        System.out.println("Valores lidos: " + originalA + ", " + originalB + ", " + originalC);
        System.out.println("Valores em ordem decrescente: " + ladoA + ", " + ladoB + ", " + ladoC);

        if (ladoA >= ladoB + ladoC) {
            System.out.println("Não formam triângulo algum.");
        }

        if (ladoA < ladoB + ladoC) {

            if (ladoA * ladoA == ladoB * ladoB + ladoC * ladoC) {
                System.out.println("Formam um triângulo retângulo.");
            }

            if (ladoA * ladoA > ladoB * ladoB + ladoC * ladoC) {
                System.out.println("Formam um triângulo obtusângulo.");
            }

            if (ladoA * ladoA < ladoB * ladoB + ladoC * ladoC) {
                System.out.println("Formam um triângulo acutângulo.");
            }

            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Formam um triângulo equilátero.");
            }

            if ((ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) && ladoA != ladoB) {
                System.out.println("Formam um triângulo isósceles.");
            }

            if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
                System.out.println("Formam um triângulo escaleno.");
            }
        }
    }
}