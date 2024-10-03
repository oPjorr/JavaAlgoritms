package classes;

import java.util.*;

public class Teste {
    String raca;
    String tamanho;
    int idade;
    String cor;

    public String getInfo() {
        return ("A raça do cachorro é: " + raca + " Tamanho é: " + tamanho + " Idade é: " + idade + " cor é: " + cor);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Teste maltes = new Teste();
        maltes.raca = "pitbull";
        maltes.tamanho = "Pequeno";
        maltes.idade = 2;
        maltes.cor = "Preto";
        System.out.println(maltes.getInfo());

    }
}