public class Autenticavel {
    private String senha;
    
// construtor
    public Autenticavel(String senha){
        this.senha = senha; }

        public boolean autentica (String senha) {
            return this.senha == senha;
        }
    }