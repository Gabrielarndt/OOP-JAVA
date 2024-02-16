public class Diretor extends Funcionario implements Autenticacao{
    //compiscao
    private Autenticavel autenticavel;


    //construtor
    public Diretor(String nome, String cpf, double salario, String senha){
        super(nome, cpf, salario, senha);                                           // super chama o construtor da classe mae(funcionario)
        this.autenticavel = new Autenticavel(senha); 
        
    }

    // polimorfismo - sobrescrever metodos de uma classe mae/pai
    @Override
    public double getBonificacao(){
        return getSalario() * 1.5;
    }
    @Override
    public boolean autentica(String senha){
        return this.autenticavel.autentica(senha);
    }
}

