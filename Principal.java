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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setUsuario("MP");
        c.setNome("Marcos");
        c.setDocumento("43.987.652-7");
        c.verificarSenha("12345");
        c.exibeDados();
        
        Cliente b = new Cliente();
        b.setNome("Joana");
        b.setUsuario("Jo22");
        b.setDocumento("43.987.564-2");
        b.verificarSenha("123");
        b.exibeDados();
        
        Cliente d = new Cliente();
        d.setNome("Elisa");
        d.setUsuario("Eli");
        d.setDocumento("43.966.554-3");
        d.verificarSenha("12");
        d.exibeDados();
        
        Cliente a = new Cliente();
        a.setNome("Lucas");
        a.setUsuario("Lukinha");
        a.setDocumento("43.966.557-5");
        a.verificarSenha("teste");
        a.verificarSenha("segredo");
        a.verificarSenha("12345");
        a.exibeDados();
        
        Presidente e = new Presidente();
        e.setNome("Asdrubal Leôncio Correa");
        e.setDocumento("56.988.705-4");
        e.setRamal(1);
        e.setSalario(10000.00);
        e.calculaSalarioAnual();
        e.exibeDados();
        
        Secretaria f = new Secretaria();
        f.setNome("Ana");
        f.setDocumento("84.570.948-9");
        f.setRamal(13);
        f.setSalario(2800.00);
        f.calculaSalarioAnual();
        f.exibeDados();
        
        Secretaria g = new Secretaria();
        g.setNome("Fátima");
        g.setDocumento("36.870.948-9");
        g.setRamal(14);
        g.setSalario(2800.00);
        g.calculaSalarioAnual();
        g.exibeDados();
        
        Vendedor h = new Vendedor();
        h.setNome("João");
        h.setDocumento("56.470.948-9");
        h.setRamal(15);
        h.setComissao(0.50);
        h.setSalario(1045);
        h.salarioMesComComissao();
        h.exibeDados();
        
        Vendedor i = new Vendedor();
        i.setNome("Vanessa");
        i.setDocumento("38.670.948-9");
        i.setRamal(16);
        i.setComissao(0.40);
        i.setSalario(1045);
        i.salarioMesComComissao();
        i.exibeDados();
        
        Vendedor j = new Vendedor();
        j.setNome("Carlos");
        j.setDocumento("00.870.948-9");
        j.setRamal(16);
        j.setComissao(0.20);
        j.setSalario(1045);
        j.salarioMesComComissao();
        j.exibeDados();
    }
    
}
