package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {
    protected double valor;
    protected String titular;
    protected int numeroApolice;
    protected String tipo = "produto";

    public static String getTipo(ContaCorrente conta) {
        return conta.getTipo();
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTitular() {
        return titular;
    }

    public double getValor() {
        return valor;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    @Override
    public double getValorImposto() {
        return 42 + (this.valor * 0.02);
    }
}
