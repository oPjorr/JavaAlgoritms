package classes.cap15.conteudo;

public class TestaSplit {
    public static void main(String[] args) {
        String texto = "Socorram-me, subi no ônibus em Marrocos";
        String[] palavras = texto.split(" ");
        for(int i = palavras.length-1; i>=0; i--) {
            System.out.print(palavras[i] + " ");
        }
    }
}
