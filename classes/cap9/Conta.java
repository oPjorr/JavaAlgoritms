package classes.cap9;

public abstract class Conta {
    String titular;
    int numero;
    int agencia;
    double saldo;
    String tipo;

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

    public abstract String getInfo();
}
