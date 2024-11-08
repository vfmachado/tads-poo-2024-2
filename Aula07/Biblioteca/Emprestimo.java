package Aula07.Biblioteca;

import java.time.LocalDateTime;

import Aula07.Livro;
import Aula07.Pessoa.Pessoa;

public class Emprestimo {
    
    private Livro livro;
    private Pessoa pessoa;
    private LocalDateTime data;
    private LocalDateTime devolucao;

    public Emprestimo(Livro livro, Pessoa p) {
        this.livro = livro;
        this.pessoa = p;
        this.data = LocalDateTime.now();
        this.devolucao = LocalDateTime.now().plusDays(7);
    }

    public String toString() {
        return livro.getNome() + " esta emprestado para " + pessoa.getNome() + " ateh a data " + devolucao.toString();
    }
 
}

