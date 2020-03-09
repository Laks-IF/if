/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaava;

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
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        int sum = num1 + num2;
        
        System.out.println("SOMA = " + sum);
    }
}