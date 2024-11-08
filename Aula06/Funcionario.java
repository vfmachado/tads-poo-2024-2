public class Funcionario extends Usuario {

    public Funcionario(String nome, String email, String senha) {
        super(nome, email, senha);
    }
 
    public void consultarEstoque(String nomeItem) {
        System.out.println("ACAO DE CONSULTA NO ESTOQUE FEITA PELO USUARIO " + this.getNome());
    }

    public void autoAvaliacao() {
        System.out.println("AUTO AV DO FUNCIONARIO " + this.getNome());
    }

}
