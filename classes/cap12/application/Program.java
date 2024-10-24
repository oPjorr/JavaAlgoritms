package classes.cap12.application;

import classes.cap12.entities.Conta;

public class Program {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.deposita(100);
        minhaConta.saca(1000);
    }
}
