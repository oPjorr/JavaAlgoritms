package classes.cap9.exercicios;

public class TestaPolimorfismoEHeranca {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new ContaCorrente();
        ContaPoupanca conta3 = new ContaPoupanca();

        conta1.setNumero(123);
        conta2.setTitular("Paulo");
        conta3.setSaldo(1000);

        System.out.println(conta1.getInfo());
        System.out.println(conta2.getInfo());
        System.out.println(conta3.getInfo());
        System.out.println();
        System.out.println(conta1.getNumero());
        System.out.println(conta2.getTitular());
        System.out.println(conta3.getSaldo());
    }
}
