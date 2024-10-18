package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
    private Conta conta;

    public void criaConta(Evento evento) {
        String agencia = evento.getString("agencia");
        int numero = evento.getInt("numero");
        String titular = evento.getString("titular");
        String tipo = evento.getSelecionadoNoRadio("tipo");

        if (tipo.equals("Conta Corrente")) {
            conta = new ContaCorrente(agencia, numero, titular);
        } else if (tipo.equals("Conta Poupança")) {
            conta = new ContaPoupanca(agencia, numero, titular);
        }
    }

    public void deposita(Evento evento) {
        double valor = evento.getDouble("valorOperacao");
        this.conta.deposita(valor);
    }

    public void saca(Evento evento) {
        double valor = evento.getDouble("valorOperacao");
        this.conta.saca(valor);
    }

    public void transfere(Evento evento) {
        Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
        double valor = evento.getDouble("valorTransferencia");
        this.conta.transfere(valor, destino);
    }
}
