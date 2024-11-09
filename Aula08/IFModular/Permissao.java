package IFModular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import IFModular.modulos.IModulo;
import IFModular.usuarios.Usuario;

// VAMOS IMPLEMENTAR UM SINGLETON - permitir uma unica instancia da classe no sistema todo
public class Permissao {
    /*
     * hashmap - conjunto de chaves e valores
     */
    HashMap<Usuario, List<IModulo>> permissoes;

    // CRIANDO O MEU THIS / CONTEXTO (UNICA INSTANCIA POSSIVEL ACESSIVEL)
    private static Permissao instanciaUnica;

    // para IMPLEMENTAR UM SINGLETON, VAMOS TORNAR O CONSTRUTOR PRIVADO
    private Permissao() {
        permissoes = new HashMap<>();
    }

    // ATRIBUTOS E METODOS ESTATICOS PERTENCEM A CLASSE E NÃO A INSTANCIA
    public static Permissao minhaInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Permissao();   // aqui eu consigo chamar o construtor
        }
        return instanciaUnica;
    }


    public void addPermissao(Usuario usuario, IModulo modulo) {
        // modulo.getNomeModulo()
        List<IModulo> modulosAssociadosAoUsuario = permissoes.get(usuario);
        if (modulosAssociadosAoUsuario == null) {
            permissoes.put(usuario, new ArrayList<>());
        }
        
        modulosAssociadosAoUsuario = permissoes.get(usuario);
        if (!modulosAssociadosAoUsuario.contains(modulo)) {
            modulosAssociadosAoUsuario.add(modulo);
        }
    }


    public boolean temPermissao(Usuario usuario, IModulo modulo) throws SemPermissionException {
        List<IModulo> modulosAssociadosAoUsuario = permissoes.get(usuario);
        
        boolean temPermissao = false;
        if (modulosAssociadosAoUsuario != null) {
            temPermissao = modulosAssociadosAoUsuario.contains(modulo);
        } 

        if (!temPermissao) throw new SemPermissionException();

        return true;

    }

}
