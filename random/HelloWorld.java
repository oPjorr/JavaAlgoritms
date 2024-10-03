import java.util.*;

public class HelloWorld {
    String nome = "Paulo";
    String nomeCompleto = nome + " silveira";

    public void m1() {
        System.out.println(nome);
    }

    public void m2() {
        System.out.println(nomeCompleto);
    }

    public static void main(String[] args) {
        HelloWorld t = new HelloWorld();
        t.m1();
        t.m2();
        t.nome = "João";
        System.out.println(t.nome);
    }
}


