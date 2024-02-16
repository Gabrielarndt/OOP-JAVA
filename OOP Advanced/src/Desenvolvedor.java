public class Desenvolvedor extends Funcionario{
    private String linguagem;
    //construtor
    public Desenvolvedor(String nome, String cpf, double salario, String linguagem, String senha){
        super(nome, cpf, salario, senha);                                           // super chama o construtor da classe mae(funcionario)
        this.linguagem = linguagem;
    }

    // polimorfismo - sobrescrever metodos de uma classe mae/pai
    @Override
    public double getBonificacao(){
        return getSalario() * 1.15;
    }
}
