import model.RedeSocial;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        RedeSocial rede = new RedeSocial();

        // Adicionando usuários
        Usuario alice = rede.adicionarUsuario("Alice");
        Usuario bob = rede.adicionarUsuario("Bob");
        Usuario carol = rede.adicionarUsuario("Carol");
        
        Usuario jaifer = new Usuario("jaifer");
        Usuario pablo = new Usuario("pablo");
        Usuario ronaldo = new Usuario("ronaldo");

        rede.adicionarUsuario(jaifer);
        rede.adicionarUsuario(pablo);

        // eu nao deveria conseguir fazer isso
        jaifer.addAmigo(jaifer);

        jaifer.addAmigo(pablo);
        jaifer.addAmigo(alice);
        jaifer.addAmigo(ronaldo);

        pablo.addAmigo(ronaldo);

        System.out.println("\nAMIGOS DO " + jaifer.getNome());
        for (Usuario amigo : jaifer.getAmigos()) {
            System.out.println(amigo.getNome());
        }

        System.out.println("\nAMIGOS DO " + pablo.getNome());
        for (Usuario amigo : pablo.getAmigos()) {
            System.out.println(amigo.getNome());
        }

        System.out.println("\nAMIGOS DO " + ronaldo.getNome());
        for (Usuario amigo : ronaldo.getAmigos()) {
            System.out.println(amigo.getNome());
        }
        

        // Criando conexões
        rede.conectarUsuarios(alice, bob);
        rede.conectarUsuarios(bob, carol);

        // Listando amigos
        rede.listarAmigos(alice);
        // rede.listarAmigos(bob);
        // rede.listarAmigos(carol);

        // // Listando todos os usuários
        // rede.listarTodosUsuarios();
    }
}
