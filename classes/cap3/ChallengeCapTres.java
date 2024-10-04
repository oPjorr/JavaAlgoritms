package classes.cap3;

import java.util.HashMap;
import java.util.Map;

public class ChallengeCapTres {

    public static int fibo(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return(fibo(x-1)+ fibo(x-2));
        }
    }
    public static void main(String[] args) {
        for(int n=0; n<=12; n++) {
            System.out.println(fibo(n));
        }
    }
}
