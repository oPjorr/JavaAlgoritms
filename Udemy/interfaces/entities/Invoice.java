package Udemy.interfaces.entities;

public class Invoice {
    private double basicPayment;
    private double tax;

    public Invoice(){};
    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public double getTax() {
        return tax;
    }

    public double getTotal() {
        return getBasicPayment() + getTax();
    }
}
