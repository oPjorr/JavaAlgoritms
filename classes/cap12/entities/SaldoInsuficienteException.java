package classes.cap12.entities;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(double valor) {
        super("Saldo Insuficiente para sacar o valor de: " + valor);
    }
}
