import java.util.Scanner;

public class Cliente {
    private int inteiro;
    // private float decimalMenor;
    // private double decimalMaior;
    // private char caractere;
    // private String palavra;
    // private boolean booleano;
    private String[] nomes;
    private int[] numeros;

    public Cliente() {
        inteiro = 10;
        // decimalMenor = 10.2f;
        // decimalMaior = 10.2;
        // caractere = 'a';
        // palavra = "boa noite";
        // booleano = true;
        nomes = new String[] { "joao", "Maria", "Pedro" };
        numeros = new int[10];
        numeros[5] = 6;
        numeros[9] = 11;
    }

    public void mostrarNomes() {
        System.out.println("Nomes armazenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    // Método para verificar se um número é par
    public void verificarParidade(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }
    }

    // Método para verificar se uma palavra é um palíndromo
    public boolean verificarPalindromo(String palavra) {
        String reverso = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(reverso);
    }

    // Método para imprimir uma saudação personalizada
    public void saudacaoPersonalizada(String nome) {
        System.out.println("Olá, " + nome + "! Bem-vindo!");
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.mostrarNomes();

        cliente.verificarParidade(cliente.inteiro);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra para verificar se é um palíndromo:");
        String palavra = scanner.nextLine();

        if (cliente.verificarPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        cliente.saudacaoPersonalizada(nome);
    }
}
