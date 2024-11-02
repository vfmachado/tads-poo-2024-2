package Aula07;

import Aula07.Biblioteca.Biblioteca;
import Aula07.Biblioteca.Emprestimo;
import Aula07.Pessoa.Estudante;
import Aula07.Pessoa.Pessoa;

public class MainBiblioteca {
    public static void main(String[] args) {
        
        // NAO POSSO ACESSAR DIRETAMENTE A CLASSE ABSTRATA
        // Pessoa p = new Pessoa();

        Estudante estudante = new Estudante("Davi", "123123");
        
        // Pessoa estudante = new Estudante("Davi", "123123");
        // System.out.println(((Estudante) estudante).getMatricula());


        Livro comoProgramar = new Livro("JAVA: Como Programar");

        Biblioteca biblioteca = new Biblioteca(comoProgramar);
        
        biblioteca.emprestarLivro(comoProgramar, estudante);

    }   
}
