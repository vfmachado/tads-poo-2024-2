package IFModular;

import IFModular.modulos.ModuloFinanceiro;
import IFModular.modulos.ModuloVendas;
import IFModular.usuarios.Admin;
import IFModular.usuarios.Usuario;

public class Main {
    
    public static void main(String[] args) throws SemPermissionException {
        
        ModuloFinanceiro financeiro = new ModuloFinanceiro();
        ModuloVendas vendas = new ModuloVendas();

        Usuario usuario = new Usuario();
        Usuario u2 = new Usuario();

        Permissao permissao = Permissao.minhaInstancia();
        permissao.addPermissao(usuario, financeiro);

        financeiro.extrairRelatorio(u2);

        // System.out.println(permissao.temPermissao(usuario, financeiro));
        // System.out.println(permissao.temPermissao(usuario, vendas));


        // Permissao p2 = Permissao.minhaInstancia();
        // System.out.println("TESTE");
        // System.out.println(p2.temPermissao(usuario, financeiro));

        // System.out.println("PERMISSOES SAO A MESMA INSTANCIA? " + permissao.equals(p2));
    }

}
