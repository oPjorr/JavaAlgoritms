package classes.cap3;

import java.math.BigInteger;

public class ExCinco {
    public static void main(String[] args) {
/*      int fatorial = 1;
        for(int n=1; n <= 40; n++) {
            fatorial *= n;
            System.out.println("O fatorial de " + n + " é igual a " + fatorial);
        }
         O código acima dá valores errado depois de um tempo porque int consegue armazenar um certo número de bytes, quando esse limite é ultrapassado
        deveria utilizar o tipo long q comporta um maior número de bytes, o mesmo acontece quando se utiliza o tipo long. O mais adequado é se utilizar o tipo double */
        long fatorial = 1;
        for(int n=1; n <= 40; n++) {
            fatorial *= n;
            System.out.println("O fatorial de " + n + " é igual a " + fatorial);
        }
    }
}
