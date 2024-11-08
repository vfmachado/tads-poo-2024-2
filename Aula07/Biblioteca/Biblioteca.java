package Aula07.Biblioteca;

import java.util.ArrayList;
import java.util.List;

import Aula07.Livro;
import Aula07.Pessoa.Pessoa;

public class Biblioteca {
    
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;

    public Biblioteca(Livro primeiroLivro) {
        this.livros = new ArrayList<>();
        this.livros.add(primeiroLivro);

        this.emprestimos = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro, Pessoa p) {
        Emprestimo emp = new Emprestimo(livro, p);
        emprestimos.add(emp);

        p.addEmprestimo(emp);

        System.out.println("Estou emprestando o livro " + livro.getNome() + " para a pessoa " + p.getNome());
    }

    // GOSTO MAIS ASSIM =)
    // public List<Livro> consultarEmprestimos(Pessoa p) {

    // }

}
