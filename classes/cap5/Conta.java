package classes.cap5;

public class Conta {
    String titular;
    int numero;
    double saldo;

    private double pegaSaldo() {
        return(this.saldo);
    }

    public void saca(double valor) {
        if(valor > this.saldo) {
            System.out.println("Não posso sacar esse valor");
        } else {
            this.saldo -= valor;
        }
    }
}
