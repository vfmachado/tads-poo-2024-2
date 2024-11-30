
public class Main {
    public static void main(String[] args)  throws Exception {
        
        // Ingrediente calabresa = new Ingrediente("calabresa");
        // Ingrediente queijo = new Ingrediente("queijo");
        // coloco numa lista
        // para passar por parametro da pizza
        // Pizza pizza = new Pizza("G", "normal", listaIngredientes);
        // poderia fazer todos os sets necessarios
       
        Pizza pizza1 = new Pizza.Builder()
            .tamanho("G")
            .borda("catupiry")
            .adicionarIngrediente(new Ingrediente("calabresa"))
            .build();

        System.out.println(pizza1);

        // DIFERENÇA ENTRE USAR ASSIM E UM CONSTRUTOR ... 
        // SE A GENTE PRECISSA CONSTRUIR TODOS OS CONSTRUTORES POSSIVEIS
        // ACEITANDO TODAS AS QUANTIDADES DE PARAMETROS INICIAIS POSSIVEIS
        // ISSO TORNARIA A CLASSE PIZZA MAIS COMPLEXA
        Pizza pizza2 = new Pizza.Builder()
            .tamanho("P")
            .build();

        System.out.println(pizza2);


        Pizza pizza3 = new Pizza.Builder()
            .tamanho("GG")
            .molho("Branco")
            .borda("Catupiry c/ calabresa")
            .adicionarIngrediente(new Ingrediente("quejio muzzarela"))
            .adicionarIngrediente(new Ingrediente("quejio provolone", 5))
            .adicionarIngrediente(new Ingrediente("quejio parmessao"))
            .adicionarIngrediente(new Ingrediente("quejio cheddar", 8))
            // .adicionarIngrediente(new Ingrediente("file"))
            .adicionarIngrediente(new Ingrediente("bacon", 5))
            .adicionarIngrediente(new Ingrediente("cebola", 2))
            .build();

        System.out.println(pizza3);


        try {
            Pizza pizza4 = new Pizza.Builder()
                .adicionarIngrediente(new Ingrediente("file"))
                .build();
            System.out.println(pizza4);

        } catch (Exception e) {
            System.out.println("ERRO AO MONTAR PIZZA");
            System.out.println(e.getMessage());
        }

        Pizza pizza5 = PizzaFactory.calabresa("G");
        System.out.println(pizza5);

        // POR CONTA DO PATTERN BUILDER, EU NAO CONSIGO INSTANCIAR UMA PIZZA
        // PQ FALTAM DADOS DE INICIALIZAÇÃO DESSA PIZZA...
        // Pizza pizza2 = new Pizza();
    }
}