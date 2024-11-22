package Aula09.rede;

public class Main {
    public static void main(String[] args) {
        RedeSocial rede = new RedeSocial();

        // Adicionando usuários
        Usuario alice = rede.adicionarUsuario("Alice");
        Usuario bob = rede.adicionarUsuario("Bob");
        Usuario carol = rede.adicionarUsuario("Carol");

        // Criando conexões
        rede.conectarUsuarios(alice, bob);
        rede.conectarUsuarios(bob, carol);

        // Listando amigos
        rede.listarAmigos(alice);
        rede.listarAmigos(bob);
        rede.listarAmigos(carol);

        // Listando todos os usuários
        rede.listarTodosUsuarios();
    }
}
