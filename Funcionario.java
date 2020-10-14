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
public abstract class Funcionario extends Pessoa{
    protected double salario;
    protected int ramal;

    public Funcionario(double salario, int ramal) {
        this.salario = salario;
        this.ramal = ramal;
    }
    
    public Funcionario(){
        this(0,0);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    public void calculaSalarioAnual(){
        salario = (this.salario*12) + (this.salario);
}
}
