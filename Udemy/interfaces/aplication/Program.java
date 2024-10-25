package Udemy.interfaces.aplication;

import Udemy.interfaces.entities.CarRental;
import Udemy.interfaces.entities.Vehicle;
import Udemy.interfaces.services.BrazilTaxService;
import Udemy.interfaces.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String carModel = leitura.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(leitura.nextLine(), fmt);
        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(leitura.nextLine(), fmt);

        System.out.println("Entre com o preço do dia: ");
        double precoDia = leitura.nextDouble();

        System.out.println("Entre com o preço por hora: ");
        double precoHora = leitura.nextDouble();


        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        RentalService = new RentalService(precoHora, precoDia, new BrazilTaxService());

        leitura.close();
    }
}
