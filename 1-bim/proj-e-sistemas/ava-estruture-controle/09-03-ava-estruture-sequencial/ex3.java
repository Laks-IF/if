/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaava;

import java.text.DecimalFormat;
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
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        
        int produtoAB = a * b;
        int produtoCD = d * c;
        int prodABMenosProdCD = produtoAB - produtoCD;
        
        System.out.println("DIFERENCA = " + prodABMenosProdCD);
    }
}
