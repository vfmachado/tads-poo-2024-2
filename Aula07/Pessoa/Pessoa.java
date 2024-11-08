package Aula07.Pessoa;

import java.util.ArrayList;
import java.util.List;

import Aula07.Biblioteca.Emprestimo;

public abstract class Pessoa {
    // COLOQUEI AQUI PARA NAO SER OBRIGADO A IMPLEMENTAR O CONSTRUTOR NAS CLASSES QUE HERDAM
    private List<Emprestimo> emprestimos;// = new ArrayList<>();

    public Pessoa() {
        emprestimos = new ArrayList<>();
    }

    private String nome;

    private String cpf;

    // E O PROTECTED PERMITE ACESSO DIRETO PELAS CLASSES QUE HERDAM
    protected String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) throws Exception {
        // validar o cpf
        if (cpf.length() != 11) {
            throw new Exception("CPF INVALIDO");
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void addEmprestimo(Emprestimo e) {
        this.emprestimos.add(e);
    }
}
