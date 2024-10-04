package classes.cap4;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.titular = "Danilo";
        c1.saldo = 100;

        Conta c2 = new Conta();
        c2.titular = "Danilo";
        c2.saldo = 100;

        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("Diferentes");
        }

        /* O código acima resulta em 'Diferentes' porque as duas instâncias têm referências diferentes na memória*/

        Conta c3 = new Conta();
        c3.titular = "Hugo";
        c3.saldo = 100;

        Conta c4 = new Conta();
        c3 = c4;

        if (c3 == c4) {
            System.out.println("iguais");
        } else {
            System.out.println("Diferentes");
        }

        Conta c5 = new Conta();

        Data data = new Data();
        c5.dataDeAbertura = data;
        System.out.println(c5.recuperaDadosParaImpressao());
//       se chamarmos o metodo antes de definirmos valores para as variáveis elas ficaram nulas

        c5.titular = "Pedro";
        Data.dia = 1;
        Data.mes = 1;
        Data.ano = 2024;
        System.out.println(c5.recuperaDadosParaImpressao());

        //Para que consigamos definir os valores das variáveis da classe conta na minha classe TestaConta é necessário definir elas como estáticas lá na classe Conta
        Conta.saldo = 1234;
        System.out.println(Conta.saldo);
        System.out.println(Conta.calculaRendimento());
    }
}
