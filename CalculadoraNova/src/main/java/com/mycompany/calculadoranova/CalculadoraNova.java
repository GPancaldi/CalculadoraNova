/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadoranova;

import java.util.Scanner;

/**
 *
 * @author Pancaldi
 */
public class CalculadoraNova {

    Double num1, num2;

    public static void main(String[] args) {
        Double res;
        int menu = 5;
        Scanner teclado = new Scanner(System.in);

        do {
            print_menu();
            System.out.print("Digite sua opção: ");
            menu = teclado.nextInt();
            switch (menu) {
                case 1:
                    res = soma();
                    System.out.println("Resultado:" + res + "\n");
                    break;
                case 2:
                    res = subtrair();
                    System.out.println("Resultado:" + res + "\n");
                    break;
                case 3:
                    res = multiplicar();
                    System.out.println("Resultado:" + res + "\n");
                    break;
                case 4:
                    res = dividir();
                    System.out.println("Resultado:" + res + "\n");
                    break;
            }
        } while (menu != 5);

    }

    public static void print_menu() {
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(5) Sair");
    }

    public static double soma() {
        System.out.print("Digite o primeiro numero:");
        Scanner ler = new Scanner(System.in);
        Double num1 = ler.nextDouble();
        System.out.print("Digite o segundo numero:");
        Scanner ler2 = new Scanner(System.in);
        Double num2 = ler2.nextDouble();

        return num1 + num2;
    }

    public static double subtrair() {
        System.out.print("Digite o primeiro numero:");
        Scanner ler = new Scanner(System.in);
        Double num1 = ler.nextDouble();
        System.out.print("Digite o segundo numero:");
        Scanner ler2 = new Scanner(System.in);
        Double num2 = ler2.nextDouble();

        return num1 - num2;
    }

    public static double multiplicar() {
        System.out.print("Digite o primeiro numero:");
        Scanner ler = new Scanner(System.in);
        Double num1 = ler.nextDouble();
        System.out.print("Digite o segundo numero:");
        Scanner ler2 = new Scanner(System.in);
        Double num2 = ler2.nextDouble();

        return num1 * num2;
    }

    public static double dividir() {
        System.out.print("Digite o primeiro numero:");
        Scanner ler = new Scanner(System.in);
        Double num1 = ler.nextDouble();
        System.out.print("Digite o segundo numero:");
        Scanner ler2 = new Scanner(System.in);
        Double num2 = ler2.nextDouble();

        return num1 / num2;
    }

}
