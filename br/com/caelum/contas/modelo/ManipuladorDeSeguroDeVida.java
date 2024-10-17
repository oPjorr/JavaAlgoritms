package br.com.caelum.contas.modelo;

import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {
    SeguroDeVida seguro1;

    public void criaSeguro(Evento evento) {
        evento.getString("titular");
        evento.getInt("numeroApolice");
        evento.getDouble("valor");
    }
}
