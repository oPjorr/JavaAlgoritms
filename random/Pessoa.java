package classes;
import java.util.*;

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getInfo() {
        return("Seu nome é "+ nome);
    }

    public String getIdade() {
        return("Sua idade é de: " + idade + " anos");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i=0; i<3; i++) {
            System.out.println("Informe o nome de uma pessoa: ");
            String teste = in.next();
            System.out.println("Informe sua idade: ");
            int idade = in.nextInt();
            Pessoa pessoa1 = new Pessoa(teste, idade);
            System.out.println(pessoa1.getInfo());
            System.out.println(pessoa1.getIdade());
            System.out.println(pessoa1);
        }
    }
}

/* olá */