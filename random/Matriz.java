package classes;

import java.util.ArrayList;
import java.util.List;

public class Matriz {
    static List<Integer> list;
   public Matriz() {
        this.list = new ArrayList<Integer>();
   }

    public static void main(String[] args) {
    Matriz m = new Matriz();
        System.out.println(list);
        for(int i=0; i<3; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
