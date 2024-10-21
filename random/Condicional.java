package random;

import java.util.*;

public class Condicional {
    public static void main(String[] args) {
        int contador = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int valor = input.nextInt();
        while (contador <= valor) {
            System.out.println(contador);
            contador += 1;
        }
        input.close();
    }
}

