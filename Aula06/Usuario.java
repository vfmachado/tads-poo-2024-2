// CLASSE ABSTRATA - ELA NAO PODE SER INSTANCIADA
abstract class Usuario {
    
    protected String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean validaSenha(String senha) {
        return this.senha == senha;
    }

    abstract void autoAvaliacao();
}
