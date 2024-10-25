package classes.cap12.application;

import classes.cap12.entities.Conta;
import classes.cap12.entities.ContaCorrente;
import classes.cap12.entities.SaldoInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        Conta minhaConta = new Conta();
        minhaConta.deposita(100);
        ContaCorrente minhaConta2 = new ContaCorrente();
        minhaConta2.deposita(100);
        try {
            minhaConta2.saca(900);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
