package classes.cap10.exercicios;

public class ContaCorrente extends Conta {

    public ContaCorrente() {};
    public ContaCorrente(int numero, String agencia, String titular, double saldo, String tipo) {
        super(numero, agencia, titular, saldo, tipo);
    }

    @Override
    public String getTipo() {
        return "Conta Corrente";};

    @Override
    public void saca(double valor) {
        double taxa = 0.10;

        if(valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else {
            this.saldo -= valor + taxa;
        }
    }
}
