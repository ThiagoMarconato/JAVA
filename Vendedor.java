/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamentointerno;

/**
 *
 * @author thiag
 */
public class Vendedor extends Funcionario{
    private double comissao;
    private double salario1;

    public Vendedor(double salario, int ramal) {
        super(salario, ramal);
    }

    public double getSalario1() {
        return salario1;
    }

    public void setSalario1(double salario1) {
        this.salario1 = salario1;
    }

    Vendedor() {
        this(0,0);
    }

    public Vendedor(double salario1) {
        this.salario1 = salario1;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void salarioMesComComissao(){
        salario1 = this.salario + (this.salario) * (this.comissao);
   }

    @Override
    public void exibeDados() {
        System.out.println("Vendedor: "+ nome + "\n" + "RG: " + documento +"\n" + "Ramal: " + ramal + "\n" + "Salario Mensal: " + salario + "\n" + "Comissão: " + comissao +"%" + "\n" + "Salário do Mês Comissionado: R$" + salario1);
    }
    
}