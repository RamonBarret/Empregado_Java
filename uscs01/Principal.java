package uscs01;

public class Principal {
    
    public static void main(String[] args) { 
        Empregado e1 = new Empregado();
        e1.setNome("Ramon Barreto");
        e1.setIdEmp(1242);
        e1.setCargo("Desenvolverdor Full Stack - pleno");
        e1.setEndereco("Rua Brasil, 130, ABC Paulista");
        e1.setVhoraTrabalhada(80.00f);
        e1.sethTrabalhadaMes(230);
        
      
        Gerente g1 = new Gerente();
        g1.setNome("Josh Karl");
        g1.setIdEmp(9887);
        g1.setCargo("Gerente de Vendas B2B");
        g1.setEndereco("Rua Leblon, 153, Jardins");
        g1.setVhoraTrabalhada(200.00f);
        g1.sethTrabalhadaMes(180);
        g1.setBonus(4000.00f);
        
        e1.CalculaSalario();
        g1.CalculaSalario();
        
        
        e1.ImprimeEmpregado();
        g1.ImprimeGerente();
} 
    
}
