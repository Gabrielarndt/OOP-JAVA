public class App {

    public static void main(String[] args) {
        Titular titular1 = new Titular("william", "123441414", "324242353", "23423432", "342");
        System.out.println(titular1.getNome());

        Funcionario diretor = new Diretor("joao", "235252423", 30000, "789");
        System.out.println(diretor.getNome());
        Gerente gerente = new Gerente("mario", "32443334234", 40000, "456");
        System.out.println(gerente.getSalario());
        Funcionario desenvolvedor = new Desenvolvedor("maria", "3277834234", 50000, "java", "123");
        Funcionario tesoureiro = new Tesoreiro("pedro", "56734535345", 15000, "890");

        System.out.println("bonificação do diretor" + diretor.getBonificacao());
        System.out.println("bonificação do gerente" + gerente.getBonificacao());
        System.out.println("bonificação do desenvolvedor" + desenvolvedor.getBonificacao());
        System.out.println("bonificação do tesoreiro" + tesoureiro.getBonificacao());

        // utilizando um metodo especiico da classe gerente
        gerente.dizOi();

        if (diretor.autentica("789")) {
            System.out.println("Diretor conseguiu logar no sistema.");
        } else {
            System.out.println("Diretor não conseguiu logar no sistema.");
        }
        if (titular1.autentica("342")) {
            System.out.println("Titular conseguiu logar no sistema.");
        } else {
            System.out.println("Titular não conseguiu logar no sistema.");
        }
    }
}
