abstract public class Funcionario {
    private String nome;
    private String cpf;
    //protected , apenas as classes que hardam de funcionario podem usar esse produto, getset
    private double salario;
    private String senha;

// contrutor
    public Funcionario(String nome, String cpf, double salario, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.senha = senha;
        
    }

    // getter e setters

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean autentica(String senha){
        return this.senha == senha;}


// metodo abastrato - > metidi qye as ckasses filhas devem implemntar

abstract public double getBonificacao();

}