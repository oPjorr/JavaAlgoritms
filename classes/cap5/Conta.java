package classes.cap5;

import java.util.InputMismatchException;

public class Conta {
    String titular;
    int numero;
    private double saldo;
    static int totalContas = 1;
    int id;
    String CPF;
    private final Data dataAbertura;


    Conta(int numero, double saldo, int dia, int mes, int ano, String cpf, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.id = totalContas;
        this.CPF = cpf;
        this.dataAbertura = new Data(dia, mes, ano);
        totalContas++;

    }

    Conta(int numero, double saldo, int dia, int mes, int ano, String cpf) {
        this.numero = numero;
        this.saldo = saldo;
        this.id = totalContas;
        totalContas += 1;
        this.CPF = cpf;
        this.dataAbertura = new Data(dia, mes, ano);
    }

    public void mudaCPF(String cpf) {
        validaCPF();
        CPF = cpf;
    }

    public boolean validaCPF() {

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char)(r + 48);
            }

            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else dig11 = (char)(r + 48);

            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                return(true);
            else return(false);
        } catch (InputMismatchException erro) {
            return(false);
        }
    }

    public String imprimeCPF() {
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
                CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }

    public int getId() {
        return this.id;
    }

    public String getSaldo() {
        return("Você tem " + this.saldo + " reais");
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public void sacaValor(double valor) {
        if(valor > this.saldo) {
            System.out.println("Não posso sacar esse valor");
        } else {
            this.saldo -= valor;
        }
    }

    public void depositaValor(double valor) {
        this.saldo += valor;
    }

    public String getRendimento() {
        return(String.format("Seu rendimento mensal é de %s", (saldo*0.1)) + " reais.");
    }

    public String getDataFormatura() {
        return dataAbertura.formataData();
    }
}
