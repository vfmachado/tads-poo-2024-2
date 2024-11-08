package pagamento;
public class Pix implements IMetodoPagamento {

    @Override
    public float variacao() {
        return 0.85f;
    }
    
}
