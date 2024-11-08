package pagamento;
public class Credito implements IMetodoPagamento {

    @Override
    public float variacao() {
        return 1.05f;
    }
    
}
