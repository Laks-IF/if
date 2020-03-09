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
        
        double pi = 3.14159 ;
        double radius = scan.nextDouble();
        double area = Math.pow(radius, 2) * pi;
        
        DecimalFormat df = new DecimalFormat("0.####");
        
        System.out.println("A=" + df.format(area));
    }
}