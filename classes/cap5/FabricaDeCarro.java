package classes.cap5;

public class FabricaDeCarro {
    private static FabricaDeCarro instance;
    public String cor;
    private FabricaDeCarro(String cor) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.cor = cor;
    }

    public static FabricaDeCarro getInstance(String cor) {
        if(instance == null) {
            instance = new FabricaDeCarro(cor);
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("Implementação do Singleton Pattern");
        FabricaDeCarro ferrari = FabricaDeCarro.getInstance("Preto");
        FabricaDeCarro toyota = FabricaDeCarro.getInstance("Azul");

        System.out.println(ferrari.cor);
        System.out.println(toyota.cor);
    }
}
