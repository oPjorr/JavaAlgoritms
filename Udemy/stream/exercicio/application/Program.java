package Udemy.stream.exercicio.application;

import Udemy.stream.exercicio.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter full file path: ");
        String path = leitura.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            ArrayList<Product> list = new ArrayList<>();
            String line = br.readLine();

            while(line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            double avg = list.stream().map(Product::getPrice).reduce(0.0, Double::sum) / list.size();
//             Optional<String> tmp = list.stream().map(Product::getName).reduce((x, y) -> x + "-" + y); // teste para combinar várias strings com reduce
            list.forEach(System.out::println);
            System.out.println();
            System.out.println("AVG: " + String.format("%.2f", avg) + " reais.");
//            System.out.println(tmp.get());

            Comparator<String> comp = (s1, s2) -> s1.compareToIgnoreCase(s2);
            List<String> names = list.stream().filter(p -> p.getPrice() < avg).map(Product::getName).sorted(comp.reversed()).toList();
            names.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        leitura.close();
    }
}
