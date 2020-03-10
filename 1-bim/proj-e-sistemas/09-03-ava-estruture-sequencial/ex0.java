/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DecimalFormat;

/**
 *
 * @author 06189573240
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de trabalho";

        int idade = 30;
        int codigo = 5290;
        char genero = 'F';
        
        Double preco1 = 2100.0;
        Double preco2 = 650.50;
        Double medida = 53.234567;
        
        DecimalFormat df = new DecimalFormat("0.###");
        
        System.out.println("Produtos:\n"
                + produto1 + ", cujo preço é R$ " + preco1 + "\n"
                + produto2 + ", cujo preço é R$ " + preco2 + "\n"
                + "Registro: " + idade + ", código " + codigo + " e gênero: F\n"
                + "Medida com oito casas decimais: " + medida + "\n"
                + "Três casas decimais: " + medida   + "\n"
                + "Ponto decimal nos EUA: " + df.format(medida));
    }
}
