/******************************************************************************
                         Laks Castro, 3°B Informática.
*******************************************************************************/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    
        System.out.print("Nome: ");
        String nome = input.next();
	       
	    
        System.out.print("Salário Bruto: ");
        double salarioBruto = input.nextDouble();
	    
        System.out.print("Imposto: ");
        double imposto = input.nextDouble();
        	    
        Empregado empregado = new Empregado(nome, salarioBruto, imposto);
	    
        System.out.println("\nEmpregado: " + empregado.nome + ", R$ " + empregado.salarioLiquido());
        
        System.out.println("\nQual porcentagem é para acrescentar?");
        
        double porcentagem = input.nextDouble();
        
        empregado.aumentarSalario(porcentagem);
        
        System.out.println("\nDados atualizados: " + empregado.nome + ", R$ " + empregado.salarioLiquido());
    }
}

class Empregado {
    public String nome;
    private double salarioBruto;
    private double imposto;
    
    public Empregado(String nome, double salarioBruto, double imposto){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }
    public double salarioLiquido(){
        return this.salarioBruto - this.imposto;
    }
    public void aumentarSalario(double porcentagem){
        this.salarioBruto += salarioBruto * porcentagem / 100;
    }
}
