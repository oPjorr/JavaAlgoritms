package classes.cap5;
import java.util.Scanner;

public class TestaAcessoDireto {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Conta salario = new Conta(1000, 123, 1, 12, 2024, "99899999999", "Paulo");
        Conta corrente = new Conta(1000, 1000, 29, 9, 800, "07052888971");

        System.out.println("Informações sobre a primeira conta:");
        System.out.println(salario.getDataFormatura());
        System.out.println(salario.validaCPF());
        System.out.println(salario.imprimeCPF());
        System.out.println(salario.getId());
        System.out.println(salario.getSaldo());
        salario.sacaValor(100);
        System.out.println(salario.getSaldo());

        System.out.println();
        System.out.println("Informações sobre a segunda conta:");
        System.out.println(corrente.getDataFormatura());
        System.out.println(corrente.validaCPF());
        System.out.println(corrente.imprimeCPF());
        System.out.println(corrente.getId());
        System.out.println(corrente.getSaldo());
        corrente.sacaValor(5000);
        corrente.mudaCPF("41218584092");
        System.out.println(corrente.imprimeCPF());
    }
}
