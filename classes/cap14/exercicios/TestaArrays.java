package classes.cap14.exercicios;

import java.util.Arrays;

public class TestaArrays {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10];
        double numContas = 0;
        for(int i=0; i<contas.length; i++) {
            Conta conta = new ContaCorrente();
            conta.deposita(i * 100.0);
            contas[i] = conta;
        }

        for(Conta conta : contas) {
            numContas += conta.saldo;
        }

        double media = numContas / contas.length;
        System.out.println(media);
    }
}
