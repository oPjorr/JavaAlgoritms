package classes.cap9;

public class ContaCorrente extends Conta {
    public ContaCorrente(String titular, int numero, int agencia, double saldo, String tipo) {
        super(titular, numero, agencia, saldo, tipo);
    }

    @Override
    public String getInfo() {
        return "Conta Corrente";
    }

    @Override
    public void saca(double valor) {
        double taxa = 0.10;
        super.saca(valor + taxa); // Taxa de 10 centavos
    }
}
