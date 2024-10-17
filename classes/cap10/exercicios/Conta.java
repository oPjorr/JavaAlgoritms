package classes.cap10.exercicios;

import java.util.ArrayList;

public abstract class Conta {
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

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: R$" + this.saldo;
        dados += "\nTipo: " + this.getTipo();
        return dados;
    }
}
