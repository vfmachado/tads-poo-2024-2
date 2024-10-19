import pagamento.Credito;
import pagamento.Pix;

public class Main {
    public static void main(String[] args) {
        /*
        CRIE UMA CLASSE PEDIDO, 
            QUE RECEBE NO CONSTRUTOR O VALOR TOTAL DO PEDIDO
            A CLASSE PEDIDO TEM UM METODO CHAMADO valorTotal(IMetodoPagamento metodoPagamento)
            VAO EXISTIR, INICIALMENTE, 2 METODOS DE PAGAMENTO
                PIX (DESCONTO DE 15%)
                CREDITO (ACRESCIMENTO DE 5%)

                IMetodoPagamento
                    + float variacao

                Pedido p = new Pedido(100);
                p.valorTotal(new Pix()) // 85
                p.valorTotal(new Credito) // 105
        */
    
        Pedido p = new Pedido(200);
        System.out.println("PIX: " + p.valorTotal(new Pix()));
        System.out.println("CREDITO: " + p.valorTotal(new Credito()));
    }
}