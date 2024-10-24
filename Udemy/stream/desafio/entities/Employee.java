package Udemy.stream.desafio.entities;

public class Employee {
    private String name;
    private double salary;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(String name, String email, double salary) {
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return name + ", " + email + ", " + String.format("%.2f", salary);
    }
}
