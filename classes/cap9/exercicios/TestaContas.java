package classes.cap9.exercicios;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TestaContas {
    String agencia;
    int numero;

    public boolean verificaExistenciaConta() {
        return Conta.agenciasContas.contains(this.agencia) && Conta.numerosContas.contains(this.numero);
    }

    public static void infoConta(Conta conta) {
        System.out.println("====== Informações sobre sua conta ======");
        System.out.println("Titular: " + conta.titular);
        System.out.println("Agência: " + conta.agencia);
        System.out.println("Número: " + conta.numero);
        System.out.println("Saldo: " + conta.saldo);
        System.out.println("Tipo: " + conta.tipo);
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();

        while (true) {
            System.out.println("""
                O que você deseja fazer?
                1. Mostrar as informações de um conta específica
                2. Criar uma conta
                3. Listar todas as contas
                4. Sair""");

            int opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Informe a agência de seu banco: ");
                String agencia = leitura.next();
                System.out.println("Informe o número da sua conta: ");
                int numero = leitura.nextInt();

                if(!contas.isEmpty()) {
                    for(Conta conta : contas) {
                        if (Objects.equals(agencia, conta.agencia) && numero == conta.numero) {
                            infoConta(conta);
                        }
                    }
                } else{
                    System.out.println();
                    System.out.println("não possui nenhuma conta com esses dados!");
                    System.out.println();
                }
            } else if(opcao == 2) {
                TestaContas conta2 = new TestaContas();
                System.out.println("Informe a agência de seu banco: ");
                conta2.agencia = leitura.next();
                System.out.println("Informe o número da sua conta: ");
                conta2.numero = leitura.nextInt();
                if (!conta2.verificaExistenciaConta()) {
                    System.out.println("Titular da nova conta: ");
                    String titular = leitura.next();
                    System.out.println("Informe o saldo da conta: ");
                    double saldo = leitura.nextInt();
                    System.out.println("Por último, informe o tipo da conta: ");
                    String tipo = leitura.next();

                    Conta conta = new Conta(conta2.numero, conta2.agencia, titular, saldo, tipo);
                    contas.add(conta);
                    System.out.println();
                    System.out.println("Conta criada com sucesso!");
                    System.out.println();
                } else {
                    System.out.println("\nUma conta com essa agência e número já existe.\nInsira dados para criação de uma nova conta.\n");
                }
            } else if(opcao == 3) {
                if(!contas.isEmpty()) {
                    for(Conta conta : contas) {
                        infoConta(conta);
                    }
                } else {
                    System.out.println();
                    System.out.println("Não há nenhuma conta registrada");
                    System.out.println();
                }
            } else if(opcao == 4) {
                break;
            } else{
                System.out.println("Opção Inválida!");
            }
        }
    }
}
