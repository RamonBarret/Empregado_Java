package uscs01;

public class Gerente extends Empregado {
    private String nomeSecretaria;
    
    public Gerente() {
    }
    
    public Gerente(String nomeSecretaria, String nome, int idEmp, String cargo, String endereco, float VhoraTrabalhada, int hTrabalhadaMes, float salario, float bonus) {
      
        super(nome, idEmp, cargo, endereco, VhoraTrabalhada, hTrabalhadaMes, salario, bonus); 
        this.nomeSecretaria = nomeSecretaria; 
        } 
        
        public void ImprimeGerente(){ 
        super.ImprimeEmpregado(); 
        } 
        
        public String getNomeSecretaria() { 
        return nomeSecretaria; 
        } 
        
        public void setNomeSecretaria(String nomeSecretaria) { 
        this.nomeSecretaria = nomeSecretaria;
    }
    
}
