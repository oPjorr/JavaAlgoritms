package classes.cap3;

import java.util.Scanner;

public class ExSete {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um valor inteiro");
        System.out.println();
        int valor1 = leitura.nextInt();
        leitura.close();
        while(valor1 != 1) {
            if(valor1%2 == 0) {
                valor1 /= 2;
            } else {
                valor1 = 3 * valor1 + 1;
            }
            System.out.print(valor1 + " -> ");
        }
    }
}