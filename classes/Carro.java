package classes;

public class Carro {
    String nome;
    boolean isRunning;

    public Carro(String nome, Boolean isRunning) {
        this.nome = nome;
        this.isRunning = isRunning;
    }

    public String getNomeCarro() {
        return this.nome;
    }

    public String andar() {
        isRunning = true;
        return("Estou andando!" + ' ' + isRunning);
    }

    public static void main(String[] args) {
        Carro ferrari = new Carro("Ferrari GT", false);
        System.out.println(ferrari.getNomeCarro());
        System.out.println(ferrari.andar());
    }
}