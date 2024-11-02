package Aula07.Pessoa;

public class Estudante extends Pessoa {

    private String matricula;

    public Estudante(String nome, String matricula) {
        super();    // CHAMA O CONSTRUTOR DA CLASSE PAI
        this.matricula = matricula;
        this.setNome(nome);
    
        this.email = matricula + "@aluno.riogrande.ifrs.edu.br";
    }


    public String getMatricula() {
        return this.matricula;
    }

    @Override
    public String toString() {
        return this.getNome() + " - " + this.email;
    }

}
