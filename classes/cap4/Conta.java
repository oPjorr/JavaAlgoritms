package classes.cap4;

public class Conta {
    String nome;
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;
    String out;

    public double sacar(double valor) {
        return(this.saldo -= valor);
    }

    public double depositar(double valor) {
        return(this.saldo += valor);
    }

    public String calculaRendimento() {
        return(String.format("o seu rendimento mensal é de %s", Math.ceil(saldo*0.1)));
    }

    public String recuperaDadosParaImpressao() {
        return(out);
    }
}