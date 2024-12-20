package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis {
    private double total;
    public void calculaImpostos(Evento evento) {
        int tamanhoLista = evento.getTamanhoDaLista("listaTributaveis");
        for(int i=0; i<tamanhoLista; i++) {
            Tributavel tributavel = evento.getTributavel("listaTributaveis", i);
            total += tributavel.getValorImposto();
        }
    };

    public double getTotal() {
        return total;
    }
}
