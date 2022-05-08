/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadoranova;

import java.util.Scanner;
import com.mycompany.calculadoranova.CalculoSoma;

/**
 *
 * @author Pancaldi
 */
public class CalculadoraNova {

    CalculoSoma soma = new CalculoSoma();

    public static void main(String[] args) {
        
        int menu = 5;
        Scanner teclado = new Scanner(System.in);

        do {
            print_menu();
            System.out.print("Digite sua opção: ");
            menu = teclado.nextInt();
            switch (menu) {
                case 1:
                    Calculo soma = new CalculoSoma();
                    FazerCalculo(soma);   
                    break;

                case 2:
                    Calculo subtrair = new CalculoSubtrair();
                    FazerCalculo(subtrair);
                    break;
                case 3:
                    Calculo multiplicar = new CalculoMultiplicar();
                    FazerCalculo(multiplicar);
                    break;
                case 4:
                    Calculo dividir = new CalculoDivisao();
                    FazerCalculo(dividir);
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

    public static void FazerCalculo(Calculo calculo){
        double result;
        
        result = calculo.calcular();
        
        System.out.println("Resultado:" + result + "\n");
        
    }
    
}
