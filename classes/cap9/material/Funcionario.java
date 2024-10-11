package classes.cap9.material;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getNome() {
        System.out.println(this.nome);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }

    public void getSalario() {
        System.out.println(this.salario);
    }
}
