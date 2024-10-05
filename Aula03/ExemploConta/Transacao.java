package ExemploConta;

import java.time.LocalDateTime;

public class Transacao {

    private LocalDateTime data;
    private float valor;
    private TipoTransacao tipo;

    public Transacao(float valor, TipoTransacao tipo) {
        this.data = LocalDateTime.now();
        this.valor = valor;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Transacao [data = " + data + ", valor = " + valor + ", tipo = " + tipo + "]";
    }

    
    
    public float getValor() {
        // THIS. É OPCIONAL
        return valor;
    }

    public TipoTransacao getTipo() {
        return this.tipo;
    }
}
