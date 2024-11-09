package IFModular.modulos;

import IFModular.Permissao;
import IFModular.SemPermissionException;
import IFModular.usuarios.Usuario;

public class ModuloFinanceiro implements IModulo {

    @Override
    public String getNomeModulo() {
        return "FINANCEIRO";
    }


    public void extrairRelatorio(Usuario usuario) {
        Permissao p = Permissao.minhaInstancia();
        try {
            p.temPermissao(usuario, this);
            System.out.println("RELATORIO DO MODULO FINANCEIRO");
        } catch (SemPermissionException e) {
            System.out.println("ENTREI NA EXCEPTION DO MODULO FINANCEIRO PQ " + e.getMessage());
        }
    }
    
}
