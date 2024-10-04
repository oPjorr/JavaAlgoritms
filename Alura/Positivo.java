package Alura;

import java.util.Scanner;

public class Positivo {
    public static void verificaNumero(int valor) {
        System.out.println((valor > 0) ? "Número positivo" : "Número negativo");
    }
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = leitura.nextInt();
        leitura.close();
        verificaNumero(numero);
    }
}
