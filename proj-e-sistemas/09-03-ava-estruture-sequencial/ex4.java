/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author 06189573240
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cod = scan.nextInt();
        
        double hrsTrabalhadas = scan.nextDouble();
        double rsPorHora = scan.nextDouble();
        
        double salary = hrsTrabalhadas * rsPorHora;
        
        System.out.println("NUMBER = " + cod);
        System.out.println("SALARY = U$ " + salary);
    }
}