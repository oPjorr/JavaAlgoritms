package classes.cap5;

import java.time.LocalDate;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String formataData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
