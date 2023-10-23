package veiculo;

public class Moto implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("acelerando a moto");
    }

    @Override
    public void freiar() {
        System.out.println("freiando a moto");
    }
}
