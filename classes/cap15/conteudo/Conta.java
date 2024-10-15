package classes.cap15.conteudo;

public class Conta implements Comparable<Conta> {
    String titular;
    int numero;
    int agencia;
    double saldo;

    public void saca(double valor) {
        if(valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void transfere(double valor, Conta destino) {
        this.saca(valor);
        destino.deposita(valor);
    }

    public String getInfo() {
        return this.titular + ";";
    }

    public int compareTo(Conta o) {
        return this.titular.compareTo(o.titular);
    }
}

