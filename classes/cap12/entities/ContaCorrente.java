package classes.cap12.entities;

public class ContaCorrente extends Conta{
    @Override
    public void getInfo() {
        System.out.println("Conta Corrente");
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
        double taxa = 0.10;
        if (valor < 0) {
            throw new IllegalArgumentException("O valor de saque não pode ser negativo.");
        }
        if(valor > this.saldo) {
            throw new SaldoInsuficienteException(valor);
        } else {
            super.saca(valor + taxa); // Taxa de 10 centavos
        }
    }
}
