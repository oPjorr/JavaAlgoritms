package classes.cap9;

public class SistemaBancario {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca();
        System.out.println("===================");
        System.out.println("Titular: " + poupanca.titular);
        System.out.println("Número: " + poupanca.numero);
        System.out.println("Agência: " + poupanca.agencia);
        System.out.println("Saldo: " + poupanca.saldo);
        System.out.println("===================");

        Conta cp = new ContaPoupanca();
        Conta cc = new ContaCorrente();
        System.out.println(cc.getInfo());
        System.out.println(cp.getInfo());
    }
}
