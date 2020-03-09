// EXERCÍCIO 1 =====================================================================================================
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 06792799114
 */
public class JavaApplication1 {

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


// EXERCÍCIO 2 ===================================================================================================================

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 06792799114
 */
public class JavaApplication1 {

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

// EXERCÍCIO 3 =============================================================================================================


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 06792799114
 */
public class JavaApplication1 {

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


// EXERCÍCIO 4 =========================================================================================================


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 06792799114
 */
public class JavaApplication1 {

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


// EXERCÍCIO 5 ========================================================================================================================


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 06792799114
 */
public class JavaApplication1 {

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
