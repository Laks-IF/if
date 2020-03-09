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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Compra compra1 = new Compra(scan.next(), scan.next(), scan.next());
        double subtotal1 = compra1.subtotal();
        
        Compra compra2 = new Compra(scan.next(), scan.next(), scan.next());
        double subtotal2 = compra2.subtotal();
        
        double total = subtotal1 + subtotal2;

        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("VALOR A PAGAR = U$ " + df.format(total));
    }
}

class Compra {
    int cod;
    double valorPeca;
    int qtdPecas;
    
    public Compra(String codigo, String quantidadeDePecas,String valorPorPeca){
        cod = Integer.parseInt(codigo);
        qtdPecas = Integer.parseInt(quantidadeDePecas);
        valorPeca = Double.parseDouble(valorPorPeca);
    }
    public double subtotal(){
        return valorPeca * qtdPecas;
    }
}
