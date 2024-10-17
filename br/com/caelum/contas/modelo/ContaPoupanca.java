package br.com.caelum.contas.modelo;


public class ContaPoupanca extends Conta {
    public ContaPoupanca() {};
    public ContaPoupanca(String agencia, int numero, String titular) {
        super(agencia, numero, titular);
    }

    @Override
    public String getTipo() {
        return "Conta Poupança";
    }

    @Override
    public void saca(double valor) {
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }

    }
}
