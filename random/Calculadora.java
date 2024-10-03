package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                Escolha uma opcão:
                    1. Adição
                    2. Subtração
                    3. Multiplicação
                    4. Divisão
                    5. Potência
                """);
        int opcao = leitura.nextInt();
        int valor1 = leitura.nextInt();
        int valor2 = leitura.nextInt();
        List<Integer> listaNumeros = new ArrayList<Integer>(4);
        System.out.println(listaNumeros);
        switch (opcao) {
            case 1:
                System.out.println((int) (valor1 + valor2));
                break;

            case 2:
                System.out.println((int) (valor1 - valor2));
                break;

            case 3:
                System.out.println((valor1 * valor2));
                break;

            case 4:
                System.out.println((valor1 / valor2));
                break;

            case 5:
                System.out.println((int) Math.pow(valor1, valor2));
                break;
        }
    }
}
