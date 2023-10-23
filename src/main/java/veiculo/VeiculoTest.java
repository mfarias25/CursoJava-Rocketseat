package veiculo;

public class VeiculoTest {
    public static void main(String[] args) {
        Veiculo veiculo = new Carro();
        veiculo.acelerar();
        veiculo.freiar();

        System.out.println("--------------------------------");

        Veiculo veiculo2 = new Moto();
        veiculo2.acelerar();
        veiculo2.freiar();
    }
}
