package classes.cap14.exercicios;

public class Banco {
    public String nome;
    private int numero;
    private Conta[] contas;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new ContaCorrente[10];
    }

    public void getNome() {
        System.out.println(this.nome);
    }

    public void getNumero() {
        System.out.println(this.numero);
    }

    public boolean contem(Conta conta) {
        for(Conta cc : contas) {
            if(cc==null) {
                break;
            }
            else if(cc==conta) {
                return true;
            }
        }
        return false;
    }

    public void adiciona(Conta c) {
        for(int i=0; i<this.contas.length; i++) {
            if(this.contas[i] == null) {
                contas[i] = c;
                break;
            }
        }
    }

    public void getContas() {
        for(Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public void getConta() {
        System.out.println("Pritando as contas do banco(que baita segurança)... Carregando...");
        for(Conta conta : contas) {
            System.out.println("=============================");
            System.out.println("Titular: " + conta.titular);
            System.out.println("Número: " + conta.numero);
            System.out.println("Agência: " + conta.agencia);
            System.out.println("Saldo: " + conta.saldo);
            System.out.println("=============================");
        }
    }
}
