public class Gerente extends Funcionario{
    private Autenticavel autenticavel;
   
    //construtor
    public Gerente(String nome, String cpf, double salario, String senha){
        super(nome, cpf, salario, senha);                                           // super chama o construtor da classe mae(funcionario)
        this.autenticavel = new Autenticavel(senha);
        
    }

    // polimorfismo - sobrescrever metodos de uma classe mae/pai
    @Override
    public double getBonificacao(){
        return getSalario() * 1.25;
    }
    public void dizOi() {
        System.out.println("oi do gerente");
    }

    @Override
    public boolean autentica(String senha){
        return this.autenticavel.autentica(senha);
}
}