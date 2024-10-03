package classes.cap3;

public class ExOito {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print((j*i) + " ");
            }
            System.out.println();
        }
    }
}
