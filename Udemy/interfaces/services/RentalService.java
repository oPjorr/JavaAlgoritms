package Udemy.interfaces.services;

import Udemy.interfaces.entities.CarRental;
import Udemy.interfaces.entities.Invoice;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;
    private BrazilTaxService taxService;

    public RentalService(){};
    public RentalService(double pricePerHour,double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        carRental.setInvoice(new Invoice(50, 10));


    }
}
