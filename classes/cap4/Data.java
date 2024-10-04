package classes.cap4;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;

public class Data {
    static int dia, mes, ano;

    public static String formataData() {
        String dataFormatada = String.format("%02d/%02d/%04d", dia, mes, ano);
        return(dataFormatada);
    }

    public static void main(String[] args) {
        Data dataDeAbertura = new Data();
    }
}
