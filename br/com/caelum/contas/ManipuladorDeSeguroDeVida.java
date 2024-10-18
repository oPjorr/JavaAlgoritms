package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {
    SeguroDeVida seguro1;

    public void criaSeguro(Evento evento) {
        seguro1 = new SeguroDeVida();
        this.seguro1.setTitular(evento.getString("titular"));
        this.seguro1.setNumeroApolice(evento.getInt("numeroApolice"));
        this.seguro1.setValor(evento.getDouble("valor"));
    }
}
