package classes.cap15.conteudo;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        double[] saldoContas = new double[4];
        for(int i=0; i<saldoContas.length; i++) {
            saldoContas[i] = i+1;
        }
        for(double saldo : saldoContas) {
            System.out.println(saldo);
        }
    }
}
