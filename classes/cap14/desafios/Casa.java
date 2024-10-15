package classes.cap14.desafios;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    String cor;
    int totalDePortas = 0;
    int portasAbertas = 0;
    Porta porta;
    ArrayList<String> listPortas = new ArrayList<>();

    public void pinta(String s) {
        this.cor = s;
    }

    public void adicionaPorta(Porta porta) {
        this.porta = porta;
        this.listPortas.add(porta.portaLocal);
        this.totalDePortas += 1;
        if(porta.aberta) {
            this.portasAbertas += 1;
        }
    }

    public int getTotalDePortas() {
        return this.totalDePortas;
    }


    public int quantasPortasEstaoAbertas() {
        return this.portasAbertas;
    }

    public static void main(String[] args) {
        Casa casa1 = new Casa();
        casa1.pinta("Preto");
        casa1.adicionaPorta(new Porta("Porta da frente", true));
        casa1.adicionaPorta(new Porta("Porta de trás", false));
        casa1.adicionaPorta(new Porta("Porta da garagem", false));

        System.out.println(casa1.cor);
        System.out.println(casa1.getTotalDePortas());
        System.out.println(casa1.quantasPortasEstaoAbertas());

        for(String porta : casa1.listPortas) {
            System.out.println(porta);
        }
    }
}
