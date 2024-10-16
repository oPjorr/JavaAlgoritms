package classes.cap9.exercicios;

public class ContaCorrente extends Conta {

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
