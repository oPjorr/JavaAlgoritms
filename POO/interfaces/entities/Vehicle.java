package POO.interfaces.entities;

public class Vehicle {
    private String modelo;

    public Vehicle() {};
    public Vehicle(String modelo) {
        this.modelo = modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }
}
