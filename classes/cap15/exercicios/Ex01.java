package classes.cap15.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Iniciando(ArrayList)...");
        Collection<Integer> teste = new ArrayList<>();
        long inicioArrayList = System.currentTimeMillis();

        int total = 30000;

        for(int i=0; i < total; i++) {
            teste.add(i);
        }

        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        long fimArrayList = System.currentTimeMillis();
        long tempo = fimArrayList - inicioArrayList;
        System.out.println("Tempo gasto(ArrayList): " + tempo + " ms");

        System.out.println();
        System.out.println("Iniciando(Hashset)...");
        Collection<Integer> teste2 = new HashSet<>();
        long inicioHashSet = System.currentTimeMillis();

        int total2 = 30000;

        for(int i=0; i < total2; i++) {
            teste2.add(i);
        }

        for (int i = 0; i < total2; i++) {
            teste2.contains(i);
        }

        long fimHashSet = System.currentTimeMillis();
        long tempoHashSet = fimHashSet - inicioHashSet;
        System.out.println("Tempo gasto(ArrayList): " + tempoHashSet + " ms");
    }
}
