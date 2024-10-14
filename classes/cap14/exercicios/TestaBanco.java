package classes.cap14.exercicios;

public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco("CaelumBank", 999);
        ContaCorrente correnteNaoExiste = new ContaCorrente();

        for(int i=1; i<=9; i++) {
            ContaCorrente corrente = new ContaCorrente();
            corrente.setTitular("Titular " + i);
            corrente.setNumero(i);
            corrente.setAgencia(1000);
            corrente.deposita(i * 1000);
            banco.adiciona(corrente);
//            System.out.println(banco.contem(corrente));
        }
//        System.out.println(banco.contem(null));
//        System.out.println(banco.contem(correnteNaoExiste));
        banco.getContas();
    }
}
