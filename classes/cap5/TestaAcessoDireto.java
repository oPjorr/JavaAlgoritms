package classes.cap5;

public class TestaAcessoDireto {
    public static void main(String[] args) {
        Conta salario = new Conta(1000, 123, "Paulo");
        System.out.println(salario.getSaldo());
        salario.sacaValor(100);
        System.out.println(salario.getSaldo());
        salario.depositaValor(400);
        System.out.println(salario.getSaldo());
        System.out.println();
        salario.setSaldo(2500);
        System.out.println(salario.getSaldo());
        System.out.println(salario.getRendimento());

//        Conta corrente = new Conta(1000, 123);
    }
}
