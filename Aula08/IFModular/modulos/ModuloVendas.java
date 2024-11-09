package IFModular.modulos;

public class ModuloVendas implements IModulo {

    @Override
    public String getNomeModulo() {
        return "VENDAS";
    }


    public void extrairRelatorio() {
        System.out.println("VENDAS");
    }
    
}
