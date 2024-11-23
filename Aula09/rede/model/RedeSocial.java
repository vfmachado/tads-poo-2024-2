package model;
import java.util.ArrayList;
import java.util.List;

public class RedeSocial {
    
    private List<Usuario> usuarios;

    public RedeSocial() {
        usuarios = new ArrayList<Usuario>();
    }

    // DELEGAMOS PARA A CLASSE REDESOCIAL A CRIACAO DO USUARIO
    public Usuario adicionarUsuario(String nome) {
        Usuario u = new Usuario(nome);
        usuarios.add(u);
        return u;
    }

    // CONSIDERAMOS QUE O OBJETO USUARIO VEM PRONTO E A REDE SÓ PRECISA ADICIONA-LO
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void conectarUsuarios(Usuario u1, Usuario u2) {
        u1.addAmigo(u2);
    }


    public void listarAmigos(Usuario user) {
        System.out.println("\nAMIGOS DO " + user.getNome());
        for (Usuario amigo : user.getAmigos()) {
            System.out.println(amigo.getNome());
        }
    }

}






