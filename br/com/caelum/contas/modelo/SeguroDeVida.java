package br.com.caelum.contas.modelo;

public class SeguroDeVida {
    protected double valor;
    protected String titular;
    protected int numeroApolice;
    protected double taxa = 42 + (this.valor * 0.02);

    public static String getTipo(ContaCorrente conta) {
        return conta.getTipo();
    }
}
