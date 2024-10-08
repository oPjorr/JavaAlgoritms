package classes.cap5;

public class Conta {
    String titular;
    int numero;
    private double saldo;
    static int totalContas = 1;
    int id;
    int dia;
    int mes;
    int ano;
    String cpf;


    Conta(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.id = totalContas;
        totalContas++;

    }

    Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.id = totalContas;
        totalContas += 1;
    }

    public void mudaCPF(String cpf) {
        validaCPF(cpf);
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {
        // falta implementação
    }

    public int getId() {
        return this.id;
    }

    public String getSaldo() {
        return("Você tem " + this.saldo + " reais");
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
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
