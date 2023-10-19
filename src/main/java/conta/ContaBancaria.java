package conta;

public class ContaBancaria {
    private String numero;
    private String titular;

    private double saldo;

    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    void depositar(double valor) {
        if (valor > 0 ){
            saldo = saldo + valor;
            System.out.println("Deposito de R$ " + valor + ". Saldo atual R$ " + saldo);
        }else {
            System.out.println("O valor de deposito é invalido");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo ){
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + ". Saldo atual " + saldo);
        }
    }
}
