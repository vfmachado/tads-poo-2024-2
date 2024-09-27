
// public - visibilidade, permite que os outros enxerguem
public class Contato {

    // atributos NORMALMENTE sao privados
    private String nome;
    private String telefone;
    private String email;

    private int ano;

    // metodo construtor
    public Contato() {

    }

    // criar uma sobrecargar e quiser manter o construtor padrao disponivel, eu sou obrigado a declarar
    public Contato(String nome) {
        this.setNome(nome);
    }

    public Contato(int ano) {

    }
    // this vem para solucionar o problema do nome do parametro ser igual ao nome do atributo.
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato(String nome, String telefone, String email) {

    }

    // public void colocarNome(String novoNome) {
    public void setNome(String nome) {
        this.nome = nome.trim().toUpperCase();
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}