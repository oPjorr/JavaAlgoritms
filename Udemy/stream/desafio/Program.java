package Udemy.stream.desafio;

import Udemy.stream.exercicio.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter full file path: ");
        String path = leitura.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            ArrayList<Product> list = new ArrayList<>();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        leitura.close();
    }
}
