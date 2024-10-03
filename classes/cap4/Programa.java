package classes.cap4;

public class Programa {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.titular = "Danilo";
        c1.saldo = 100;

        Conta c2 = new Conta();
        c2.titular = "Danilo";
        c2.saldo = 100;

        if (c1.titular.equals(c2.titular)) {
            System.out.println("iguais");
        } else {
            System.out.println("Diferentes");
        }

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
    }
}
