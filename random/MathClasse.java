package random;
import java.util.Random;

public class MathClasse {
    public static String ola = "Olá";
    public static void main(String[] args) {
        int number = new Random().nextInt(10);
        System.out.println(number);
        System.out.println(MathClasse.ola);
    }
}
