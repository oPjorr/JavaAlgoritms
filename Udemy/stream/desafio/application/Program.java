package Udemy.stream.desafio.entities;

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
            ArrayList<Employee> list = new ArrayList<>();

            System.out.println("Enter salary: ");
            double salary = leitura.nextDouble();
            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.println("Email of people whose salary is more than " + salary + ": ");
            list.stream().filter(employee -> employee.getSalary() >= salary).map(Employee::getEmail).sorted(String::compareTo).forEach(System.out::println);

            System.out.print("Sum of salary of people whose name starts with 'M': ");
            double sum = list.stream().filter(employee -> employee.getName().charAt(0) == 'M').map(Employee::getSalary).reduce(0.0, Double::sum);
            System.out.print(sum);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        leitura.close();
    }
}
