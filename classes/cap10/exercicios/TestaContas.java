package classes.cap10.exercicios;

public class TestaContas {
    public static void main(String[] args) {
        Conta conta2 = new ContaCorrente();
        Conta conta3 = new ContaPoupanca();

        conta2.setTitular("Paulo");
        conta3.setSaldo(1000);
        conta3.setSaldo(2000);
        System.out.println(conta3.getSaldo());
        conta3.saca(500);
        System.out.println(conta3.getSaldo());

        System.out.println(conta3.recuperaDadosParaImpressao());
    }
}
