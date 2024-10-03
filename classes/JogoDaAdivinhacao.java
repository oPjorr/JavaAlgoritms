package classes;

import javax.print.attribute.standard.JobMessageFromOperator;
import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroCerto = new Random().nextInt(2);
        System.out.println("Você terá um total de 5 tentativas!");
        System.out.println("Informe um número inteiro de 1 a 100");
        for(int i=0; i < 5; i++) {
            int tentativa = leitura.nextInt();
            if (tentativa != numeroCerto) {
                if (tentativa > numeroCerto) {
                    System.out.println("Errado! " + tentativa + " é maior que o número secreto");
                } else {
                    System.out.println("Errado! " + tentativa + " é menor que o número secreto");
                }
            } else {
                System.out.println("Parabéns! Você acertou em " + (i+1) + " tentativas! o numero secreto era " + numeroCerto);
                break;
            }
            if (i==4) {
                System.out.println("Você gastou todas as suas tentativas! Game Over");
                break;
            }
        }
        leitura.close();
    }
}
