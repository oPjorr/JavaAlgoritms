package Udemy.Generics.CuringasDelimitados;

import java.util.ArrayList;
import java.util.List;

public class Covariancia {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(11);
        intList.add(4);

        List<? extends Number> list = intList;
        Number x = list.get(0);
//        list.add(2);
    }
}
