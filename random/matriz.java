package classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class matriz {
    static List<Integer> list;
   public matriz() {
        this.list = new ArrayList<Integer>();
   }

    public static void main(String[] args) {
    matriz m = new matriz();
        System.out.println(list);
        for(int i=0; i<3; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
