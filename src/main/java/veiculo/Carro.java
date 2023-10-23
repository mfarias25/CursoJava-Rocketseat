package veiculo;

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("acelerando o carro");
    }

    @Override
    public void freiar() {
        System.out.println("freiando o carro");
    }
}
