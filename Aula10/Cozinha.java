public class Cozinha implements ObservadorPedido {

    private String nome;

    Cozinha(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("A cozinha " + nome + " foi avisada que o pedido esta " + pedido.getStatus());
    }

}
