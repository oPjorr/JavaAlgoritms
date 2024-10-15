package classes.cap15.conteudo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("sla");
        lista.add("andré");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
