package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta> {
    protected String titular;
    protected int numero;
    protected String agencia;
    protected double saldo;
    protected String tipo;

    public Conta() {};
    public Conta(int numero, String agencia, String titular, double saldo, String tipo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public Conta(String agencia, int numero, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public abstract void saca(double valor);

    public abstract String getTipo();

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void transfere(double valor, Conta destino) {
        this.saca(valor);
        destino.deposita(valor);
    }

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: R$" + this.saldo;
        dados += "\nTipo: " + this.getTipo();
        return dados;
    }

    public int compareTo(Conta outraconta) {
        return this.titular.compareTo(outraconta.titular);
    }
}
