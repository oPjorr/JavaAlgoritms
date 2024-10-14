package classes.cap9;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, int numero, int agencia, double saldo, String tipo) {
        super(titular, numero, agencia, saldo, tipo);
    }

    @Override
   public String getInfo() {
       return "Conta Poupança";
   }
}
