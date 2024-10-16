package classes.cap9.exercicios;

import java.util.ArrayList;

public class Conta {
    String titular;
    int numero;
    int agencia;
    double saldo;
    String tipo;

    public static ArrayList<Integer> agenciasContas = new ArrayList<>();
    public static ArrayList<Integer> numerosContas = new ArrayList<>();

    public void setNumero(int numero) {
        this.numero = numero;
        numerosContas.add(this.numero);
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
        agenciasContas.add(this.agencia);
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

    public void saca(double valor) {
        if(valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void transfere(double valor, Conta destino) {
        this.saca(valor);
        destino.deposita(valor);
    }

    public String getInfo() {return "Conta(classe mãe)";};
}
