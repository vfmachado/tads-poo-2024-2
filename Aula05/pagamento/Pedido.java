import pagamento.IMetodoPagamento;

public class Pedido {
    private float valor;
    
    Pedido(float valor) {
        this.valor = valor;
    }

    public float valorTotal(IMetodoPagamento metodoPagamento) {
        return this.valor * metodoPagamento.variacao();
        // return metodoPagamento.variacao(this.valor);
    }
}