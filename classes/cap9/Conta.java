package classes.cap9;

public class Conta {
    String titular;
    int numero;
    int agencia;
    double saldo;
    String tipo;

    public Conta(String titular, int numero, int agencia, double saldo, String tipo) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public void getInfo() {
        System.out.println("Olá");
    }
}
