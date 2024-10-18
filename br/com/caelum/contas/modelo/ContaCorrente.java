package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente() {};
    public ContaCorrente(String agencia, int numero, String titular) {
        super(agencia, numero, titular);
    }

    @Override
    public String getTipo() {
        return "Conta Corrente";};

    @Override
    public void saca(double valor) {
        double taxa = 0.10;

        if(valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else {
            this.saldo -= valor + taxa;
        }
    }

    @Override
    public double getValorImposto() {
        return saldo * 0.01;
    }
}
