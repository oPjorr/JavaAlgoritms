package classes.cap14.desafios;

import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args) {
        int limit = 10;

        long[] series = new long[limit];
        series[0] = 1;
        series[1] = 1;

        for(int i=2; i<limit; i++) {
            series[i] = series[i-1] + series[i-2];
        }

        for(long serie : series) {
            System.out.print(serie + " ");
        }
    }
}
