package classes.cap15.desafios;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> numerosAleatorios = new ArrayList<>();
        for(int i = 0; i<1000; i++) {
            numerosAleatorios.add((int) (Math.random()*1000));
        }

        numerosAleatorios.sort(Comparator.reverseOrder());
        System.out.println(numerosAleatorios);
    }
}
