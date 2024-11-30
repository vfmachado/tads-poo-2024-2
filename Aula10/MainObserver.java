public class MainObserver {
    public static void main(String[] args) {
        
        Cozinha cozinhaPrincipal = new Cozinha("Principal");
        Cozinha cozinhaDrinks = new Cozinha("Bebidas");

        Pedido pedido = new Pedido(cozinhaPrincipal);
        
        Entregador entregador = new Entregador();
        pedido.addObservador(entregador);

        pedido.setStatus("em andamento");
        pedido.setStatus("pronto");

        pedido.setStatus("entregue");

    }
}
