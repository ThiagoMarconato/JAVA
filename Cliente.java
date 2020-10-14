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
public class Cliente extends Pessoa{
    private String usuario;
    private String senha;
    
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = "12345";
    }
    
    public Cliente(){
        this("", "");
    }

    public boolean verificarSenha(String senha1){
        if(senha1 == this.senha){
            System.out.println("Senha digitada:" + senha1 + "\n" + "Senha correta:" + senha + "\n" + "Senha correta! Acesso Permitido");
            return true;
        }else
            System.out.println("Senha digitada:" + senha1 + "\n" + "Senha correta:" + senha + "\n" + "Acesso Negado! Digite senha correta!");
            return false;
   } 

    @Override
    public void exibeDados() {
        System.out.println("Cliente: "+ nome + "\n" + "RG: " + documento +"\n" + "Usuario: " + usuario + "\n" +"Senha: " + senha + "\n" + "\r");
    }
}   
