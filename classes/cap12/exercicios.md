1. O que acontece se acabar a memória da Java Virtual Machine?
R: A aplicação é interrompida


2. Rode a aplicação, cadastre uma conta e tente depositar um valor negativo. O que acontece? R: Se o valor de saldo for menor do que valor, uma exceção SaldoInsuficienteException será lançada.
6. E agora? Como fica o método saca da classe ContaCorrente?
```java
public void saca(double valor) throws SaldoInsuficienteException {
    if (valor < 0) {
        throw new IllegalArgumentException("O valor de saque não pode ser negativo.");
    }
    if (this.saldo < valor) {
        throw new SaldoInsuficienteException(valor);
    }
    this.saldo -= valor;
}
```

7. try-catch - throws
```java
// try-catch
public void realizarSaque(ContaCorrente conta, double valor) {
    try {
        conta.saca(valor);
    } catch (SaldoInsuficienteException e) {
        System.out.println(e.getMessage());
    }
}

//throws
public void saca(ContaCorrente conta, double valor) throws SaldoInsuficienteException {
    conta.saca(valor);
}

```