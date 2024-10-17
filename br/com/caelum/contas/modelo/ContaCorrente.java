package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{

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
}
