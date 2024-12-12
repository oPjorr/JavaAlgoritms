package random;

import java.util.Arrays;

public class Presents {
    public static void main(String[] args) {
        int indice = 0;
        long soma= 0;
        int[] gifts = {25, 64, 9, 4,100};
        int k = 4;

        while (k != 0) {
            int maior = 0;
            for(int i=0; i<gifts.length; i++) {
                if (gifts[i] > maior) {
                    maior = gifts[i];
                    indice = i;
                }
            }

            gifts[indice] = (int) Math.sqrt(maior);
            k -= 1;
        }

        System.out.println(Arrays.toString(gifts));
        for(int gift : gifts) {
            soma += gift;
        }
        System.out.println(soma);
    }
}
