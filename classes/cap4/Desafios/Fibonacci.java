package classes.cap4.Desafios;

public class Fibonacci {
    public int calculaFibonacci(int x) {
        if(x==0) {
            return(0);
        } if(x==1) {
            return(1);
        } else {
            return(calculaFibonacci(x-1) + calculaFibonacci(x-2));
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for(int i=1; i<=6; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.println(resultado);
        }
    }
}
