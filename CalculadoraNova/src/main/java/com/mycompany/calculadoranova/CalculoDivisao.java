/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoranova;

import java.util.Scanner;

/**
 *
 * @author Pancaldi
 */
public class CalculoDivisao extends Calculo{
    
    public double calcular(){
        
        System.out.print("Digite o primeiro numero:");
        Scanner ler = new Scanner(System.in);
        Double num1 = ler.nextDouble();
        System.out.print("Digite o segundo numero:");
        Scanner ler2 = new Scanner(System.in);
        Double num2 = ler2.nextDouble();

        return num1 / num2;
    }
}
