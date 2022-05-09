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
    
    @Override
    public float calcular(float[] x){
        return x[0] / x[1];
    }
    
    @Override
    public float[] inserirdados(){
        float[] dado = new float[2];
        
        System.out.print("Digite o primeiro numero:");
        Scanner ler = new Scanner(System.in);
        dado[0] = ler.nextFloat();
        System.out.print("Digite o segundo numero:");
        Scanner ler2 = new Scanner(System.in);
        dado[1] = ler2.nextFloat();
    
        return dado;
    }
}
