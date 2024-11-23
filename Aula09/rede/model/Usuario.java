package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *  Classe Usuario criado por vini no dia 22/11
 *  o usuario contem uma lista de amigos que nao pode conter ele mesmo
 */
public class Usuario {
    
    private String nome;
    // senha
    // id, email, avatar

    // MULTIPLICIDADE E AUTO RELACIONAMENTO
    // private List<Usuario> amigos;
    private HashSet<Usuario> amigos;

    public Usuario(String nome) {
        this.nome = nome;
        amigos = new HashSet<Usuario>();
    }
    
    public String getNome() {
        return nome;
    }

    public HashSet<Usuario> getAmigos() {
        return amigos;
    }

    // usuarioA.addAmigo(usuarioB)
    /**
     * 
     * @param outro caso outro seja o proprio this, o metodo nao faz coisa alguma.
     */
    public void addAmigo(Usuario outro) {

        if (this.equals(outro)) return;

        amigos.add(outro);

        // outro => é o amigo parametro da funcao
        // this => é quem chamou o método
        // amigos => hashset do OUTRO
        outro.amigos.add(this);
    }


    // EQUALS É UM MÉTODO DA CLASSE OBJECT
    // TODA CLASSE EM JAVA HERDA NATURALMENTE DE OBJECT
    @Override
    public boolean equals(Object outro) {
        // ESTAMOS COMPARANDO O NOME DO USUARIO (NOMES UNICOS MESMO QUE REFERENCIAS DIFERENTES)
        // return this.nome.equals( ((Usuario)outro).nome);

        // ESTAMOS A REFERENCIA DE MEMORIA
        return this == outro; 
    }
}

