/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 06189573240
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     
    static DecimalFormat df = new DecimalFormat("0.###");
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double pi = 3.14159;

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        
        showGeometricForm("TRIANGULO", (a * c) / 2);
        showGeometricForm("CIRCULO", pi * Math.pow(c, 2));
        showGeometricForm("TRAPEZIO", ((a + b) * c) / 2);
        showGeometricForm("QUADRADO", Math.pow(b, 2));
        showGeometricForm("RETANGULO", a * b);
    }
    public static void showGeometricForm(String name, double area){
        System.out.println(name + ": " + df.format(area));
    }
}
