package ExemploConta;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    
    private Cliente cliente;
    private int numero;
    private String tipo;
    private List<Transacao> transacoes;

    Conta(Cliente cliente) {
        this.numero = RegistraConta.criaNumeroConta();
        this.cliente = cliente;
        this.tipo = "CORRENTE";    // CORRENTE OU POUPANÇA
        this.transacoes = new ArrayList<Transacao>();
    }

    public String toString() {
        return this.cliente.getNome() + " - " + this.numero;
    }

    public void depositar(float valor) {
        // CRIANDO UMA TRANSACAO
        Transacao transacao = new Transacao(valor, TipoTransacao.CREDITO);
        this.transacoes.add(transacao);
    }

    public void sacar(float valor) {
        // CRIANDO UMA TRANSACAO
        Transacao transacao = new Transacao(valor, TipoTransacao.DEBITO);
        this.transacoes.add(transacao);
    }

    public void historico() {
        System.out.println(this.toString());
        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println(transacoes.get(i));
        }
    }

    public float saldo() {
        float saldo = 0;
        for (Transacao t : transacoes) {
            if (t.getTipo() == TipoTransacao.CREDITO) {
                saldo = saldo + t.getValor();
            } else if (t.getTipo() == TipoTransacao.DEBITO) {
                saldo = saldo - t.getValor();
            }
        }

        return saldo;
    }
}
