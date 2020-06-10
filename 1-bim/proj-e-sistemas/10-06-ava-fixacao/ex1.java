/******************************************************************************

                         Laks Castro, 3°B Informática.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    
        System.out.println("Digite a largura e altura do retângulo:");
	    
        double largura = input.nextDouble();
        double altura = input.nextDouble();
        	    
        Retangulo retangulo = new Retangulo(largura, altura);
	    
        System.out.println("AREA = " + retangulo.area());
        System.out.println("PERIMETRO = " + retangulo.perimetro());
        System.out.println("DIAGONAL = " + retangulo.diagonal());
    }
}

class Retangulo {
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    public double area(){
        return this.largura * this.altura;
    }
    public double perimetro(){
        return this.largura * 2 + this.altura * 2;
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(this.largura, 2) + Math.pow(this.altura, 2));
    }
}




























