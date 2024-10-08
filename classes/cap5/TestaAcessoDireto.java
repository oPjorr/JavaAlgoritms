package classes.cap5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestaAcessoDireto {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
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
        Conta corrente = new Conta(1000, 123);
        Conta poupanca = new Conta(1000, 123);
        salario.cpf = "070.528.889-71";

        //Testes
//        System.out.println("Informe a data de abertura da sua conta: ");
//        System.out.println("Dia: ");
//        salario.dia = leitura.nextInt();
//        System.out.println("Mês: ");
//        salario.mes = leitura.nextInt();
//        System.out.println("Ano: ");
//        salario.ano = leitura.nextInt();


    }
}
