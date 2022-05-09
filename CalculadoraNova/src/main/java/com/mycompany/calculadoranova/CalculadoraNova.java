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

    CalculoSoma soma = new CalculoSoma();

    public static void main(String[] args) {
        
        int opcaoescolhida;
        Scanner teclado = new Scanner(System.in);

        do {
            print_menu();
            System.out.print("Digite sua opção: ");
            opcaoescolhida = teclado.nextInt();
            Calculo operacao;
            
            operacao = switch (opcaoescolhida) {
                case 1 -> new CalculoSoma();
                case 2 -> new CalculoSubtrair();
                case 3 -> new CalculoMultiplicar();
                case 4 -> new CalculoDivisao();
                default -> null;
            };
            
            if(operacao != null){
                FazerCalculo(operacao);
            }
        } while (opcaoescolhida != 5);

    }

    public static void print_menu() {
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(5) Sair");
    }

    public static void FazerCalculo(Calculo calculo){
        float result;
        
        System.out.print("Digite o primeiro numero:");
        Scanner ler = new Scanner(System.in);
        float num1 = ler.nextFloat();
        System.out.print("Digite o segundo numero:");
        Scanner ler2 = new Scanner(System.in);
        float num2 = ler2.nextFloat();
        
        result = calculo.calcular(num1, num2);
        
        System.out.println("Resultado:" + result + "\n");
        
    }
    
}
