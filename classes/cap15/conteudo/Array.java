package classes.cap15.conteudo;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        double[] saldoContas = new double[4];
        String[] sla = new String[2];
        sla[0] = "Olá";
        sla[1] = "Mundo!";
        for(int i=0; i<saldoContas.length; i++) {
            saldoContas[i] = i+1;
        }
        for(double saldo : saldoContas) {
            System.out.println(saldo);
        }

        for(String lista : sla ) {
            System.out.println(lista);
        }

        System.out.println(Arrays.toString(sla));
    }
}
