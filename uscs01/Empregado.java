package uscs01;

public class Empregado {
    private String nome;
    private int idEmp;
    public static int cont_emp;
    public String cargo;
    private String endereco;
    private float VhoraTrabalhada;
    private int hTrabalhadaMes;
    private float salario;
    private float bonus;
    
    public Empregado(){
        cont_emp++;
    }
    
    public Empregado(String nome,  int idEmp, String cargo, String endereco, float VhoraTrabalhada, int hTrabalhadaMes, float salario, float bonus) {
        this.nome = nome;
        this.idEmp = idEmp;
        this.cargo = cargo;
        this.endereco = endereco;
        this.VhoraTrabalhada = VhoraTrabalhada;
        this.hTrabalhadaMes = hTrabalhadaMes;
        this.salario = salario;
        this.bonus = bonus;
        cont_emp++;
    }
    
    public void ImprimeEmpregado(){
        System.out.println("--- Função: ImprimeEmpregado ---");
        System.out.println("Nome: "+this.nome);
        System.out.println("ID: "+this.idEmp);
        System.out.println("Cargo: "+this.cargo);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Salário: R$ "+this.salario);
        System.out.println("--------------------------------------------------------\n");
    }
    
    public void TotalEmpregados() {
        System.out.println("Quantidade de empregados cadastrados: "+cont_emp);
    }
    
    public void ImprimeSalario() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Salário: "+this.salario);
    }
    
    public void CalculaSalario(){
        salario = (VhoraTrabalhada * hTrabalhadaMes) + bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdEmp() {
        return idEmp;
    }
    
    public void setIdEmp (int idEmp) {
        this.idEmp = idEmp;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getVhoraTrabalhada() {
        return VhoraTrabalhada;
    }

    public void setVhoraTrabalhada(float VhoraTrabalhada) {
        this.VhoraTrabalhada = VhoraTrabalhada;
    }

    public int gethTrabalhadaMes() {
        return hTrabalhadaMes;
    }

    public void sethTrabalhadaMes(int hTrabalhadaMes) {
        this.hTrabalhadaMes = hTrabalhadaMes;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float getBonus () {
        return bonus;
    }
    
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
}
