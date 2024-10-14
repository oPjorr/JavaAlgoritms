package classes.cap9;

public class SistemaBancario {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca("Paulo", 1, 1, 1000, "poupanca");
        System.out.println("===================");
        System.out.println("Titular: " + poupanca.titular);
        System.out.println("Número: " + poupanca.numero);
        System.out.println("Agência: " + poupanca.agencia);
        System.out.println("Saldo: " + poupanca.saldo);
        System.out.println("===================");

        Conta cp = new ContaPoupanca("Paulo", 123, 1234, 1000, "Poupanca");
        Conta cc = new ContaCorrente("Patricia", 103, 1234, 0, "Corrente");
        System.out.println(cc.getInfo());
        System.out.println(cp.getInfo());
    }
}
