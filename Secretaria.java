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
public class Secretaria extends Funcionario{
  
    
      @Override
    public void exibeDados() {
        System.out.println("Secretária: "+ nome + "\n" + "RG: " + documento +"\n" + "Ramal: " + ramal + "\n" +"Salário Mensal: R$" + salario + "\n");
    }
 
}
