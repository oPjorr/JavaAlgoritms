package classes.cap4;

public class Conta {
    String nome;
    String titular;
    int numero;
    String agencia;
    static double saldo;
    Data dataDeAbertura;
    String out;

    public double sacar(double valor) {
        return(saldo -= valor);
    }

    public double depositar(double valor) {
        return(saldo += valor);
    }

    public static String calculaRendimento() {
        return(String.format("o seu rendimento mensal é de %s", Math.ceil(saldo*0.1)));
    }

    public String recuperaDadosParaImpressao() {
        out = "\nTitular: " + this.titular;
        out += "\nDia: " + this.dataDeAbertura.dia;
        out += "\nMês: " + this.dataDeAbertura.mes;
        out += "\nAno: " + this.dataDeAbertura.ano;
        out += "\nData Formatada: " + this.dataDeAbertura.formataData();
        return(out);
    }
}