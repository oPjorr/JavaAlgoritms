package classes;
import classes.Cachorro;

public class Cachorro {
    String raca;
    boolean temDono;
    int idade;

    public Cachorro(String raca, boolean temDono, int idade) {
        this.raca = raca;
        this.temDono = temDono;
        this.idade = idade;
    }

    public String getInfo() {
        return(raca + " tem " + idade + " anos " + ", possui dono? " + temDono);
    }

    public static void main(String[] args) {
        Cachorro pug = new Cachorro("Pug", false, 10);
        System.out.println(pug.getInfo());
    }
}
