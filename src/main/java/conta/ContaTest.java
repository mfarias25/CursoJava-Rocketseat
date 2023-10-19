package conta;

public class ContaTest {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("3234", "Mateus");

        contaBancaria.depositar(500);
        contaBancaria.sacar(50);
    }
}
