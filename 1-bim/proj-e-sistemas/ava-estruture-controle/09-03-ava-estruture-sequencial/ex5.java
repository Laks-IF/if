/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaava;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 06189573240
 */
public class JavaAva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        String peca1Data = scan.next();
        String peca2Data = scan.next();
        
        String[] peca1 = peca1Data.split(" ");
        
        System.out.println(peca1[1]);
        /*
        int cod = scan.nextInt();
        double valorPeca = scan.nextDouble();
        int qtdPecas = scan.nextInt();

        double subTotal = valorPeca * qtdPecas;

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("VALOR A PAGAR = U$ " + df.format(subTotal));
        */
    }
}