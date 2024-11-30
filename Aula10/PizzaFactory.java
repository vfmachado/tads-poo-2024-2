
// FACTORY = CRIA OBJETOS PRONTOS
public class PizzaFactory {
    
    private PizzaFactory() {
        
    }

    public static Pizza calabresa(String tamanho) throws Exception {

        Pizza p = new Pizza.Builder()
            .tamanho(tamanho)
            .adicionarIngrediente(new Ingrediente("calabresa"))
            .adicionarIngrediente(new Ingrediente("muzzarela"))
            .adicionarIngrediente(new Ingrediente("cebola"))
            .build();

        return p;

    }

}
