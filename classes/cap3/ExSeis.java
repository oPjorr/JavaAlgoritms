package classes.cap3;

public class ExSeis {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        for(int n=0; n<10; n++) {
            System.out.println(n1);
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
