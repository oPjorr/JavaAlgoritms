package classes.cap9.exercicios;

public class SistemaBancario {

    Conta conta;
    public void mostraTela(Conta conta) {
        System.out.println("====== Informações sobre sua conta ======");
        System.out.println("Titular: " + conta.titular);
        System.out.println("Número: " + conta.numero);
        System.out.println("Agência: " + conta.agencia);
        System.out.println("Saldo: " + conta.saldo);
        System.out.println("===================");
    }
}
