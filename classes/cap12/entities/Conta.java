package classes.cap12.entities;

import java.util.ArrayList;

public class Conta {
    protected String titular;
    protected int numero;
    protected String agencia;
    protected double saldo;
    protected String tipo;
    private int limite;

    public static ArrayList<String> agenciasContas = new ArrayList<>();
    public static ArrayList<Integer> numerosContas = new ArrayList<>();

    public Conta() {};
    public Conta(int numero, String agencia, String titular, double saldo, String tipo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
        numerosContas.add(this.numero);
        agenciasContas.add(this.agencia);
    }

    public void setNumero(int numero) {
        this.numero = numero;
        numerosContas.add(this.numero);
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

    public String getTipo() {
        return tipo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void saca(double valor) throws SaldoInsuficienteException{
        if(valor > this.saldo) {
            throw new SaldoInsuficienteException(valor);
        } else {
            this.saldo -= valor;
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        if(valor > this.saldo) {
            throw new SaldoInsuficienteException(valor);
        } else {
            this.saca(valor);
            destino.deposita(valor);
        }
    }

    public void getInfo() {
        System.out.println("Conta(classe mãe)");};
}
