package classes.cap9.material;

public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.autentica(1234);
        gerente1.setNome("Paulo");
        gerente1.getNome();
        gerente1.setSalario(5000);
        gerente1.getSalario();
        System.out.println((int) (gerente1.getBonificacao()));
    }
}
