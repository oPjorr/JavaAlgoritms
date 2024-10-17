package classes.cap10.exercicios;

public class ContaPoupanca extends Conta {

    @Override
    public String getTipo() {
        return "Conta Poupança";
    }

    @Override
    public void saca(double valor) {
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }

    }
}
