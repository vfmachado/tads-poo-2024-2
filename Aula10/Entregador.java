public class Entregador implements ObservadorPedido {

    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("O entregador foi avisado que o pedido esta " + pedido.getStatus());
        
        if (pedido.getStatus().equals("pronto")) {
            pedido.setStatus("saiu para entrega");
        }
    }

}
