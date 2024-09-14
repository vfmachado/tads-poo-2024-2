package Aula01.Agenda;

public class Contato {
    
    // atributos
    String nome;
    String telefone;
    String email;

    Contato() {
        nome = "NAO INFORMADO";
    }

    Contato(String n) {
        this.nome = n;
    }

    // funcao - detalha/exibe contato
    public void exibe() {
        System.out.println(nome + "\n\t" + telefone + "\n\t" + email);
    }

    public void exibeFormatado() {
        System.out.println("NOME: " + nome + "\n\tFONE: " + telefone + "\n\tEMAIL: " + email);
    }

    public String detalha() {
        return "NOME: " + nome + "\n\tFONE: " + telefone + "\n\tEMAIL: " + email;
    }
}
