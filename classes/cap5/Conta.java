package classes.cap5;

public class Conta {
    String titular;
    int numero;
    private double saldo;
    int id = 1;

    public void gerarId(int id) {
        this.id = id;
        this.id++;
    }

    Conta(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getSaldo() {
        return("Você tem " + this.saldo + " reais");
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void sacaValor(double valor) {
        if(valor > this.saldo) {
            System.out.println("Não posso sacar esse valor");
        } else {
            this.saldo -= valor;
        }
    }

    public void depositaValor(double valor) {
        this.saldo += valor;
    }

    public String getRendimento() {
        return(String.format("Seu rendimento mensal é de %s", (saldo*0.1)) + " reais.");
    }
}
