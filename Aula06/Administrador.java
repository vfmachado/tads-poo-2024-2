public class Administrador extends Funcionario {

    public Administrador(String nome, String email, String senha) {
        // super chama o método da classe pai
        // construtor
        super(nome, email, senha);
        
    }
 
    // sobrescrever
    @Override
    public String getNome(){
        return "ADMIN " + this.nome;
    }


    public void inserirItem() {
        System.out.println("O usuario de email " + this.getEmail());
        System.out.println("FINGE QUE INSERE");
    }

    @Override
    public void autoAvaliacao() {
        System.out.println("NAO PRECISA VC EH ADMIN");    
    }
}
