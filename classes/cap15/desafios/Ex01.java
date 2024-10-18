package classes.cap15.desafios;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {
        Set<Integer> numerosAleatorios = new TreeSet<>(Comparator.reverseOrder());
        for(int i = 0; i<1000; i++) {
            numerosAleatorios.add((int) (Math.random()*1000));
        }
        System.out.println(numerosAleatorios);
    }
}
