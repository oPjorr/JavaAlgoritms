package classes.cap12.entities;

public class ContaCorrente extends Conta{
    @Override
    public void getInfo() {
        System.out.println("Conta Corrente");
    }

    @Override
    public void saca(double valor) {
        double taxa = 0.10;
        super.saca(valor + taxa); // Taxa de 10 centavos
    }
}
