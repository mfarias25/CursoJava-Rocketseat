package construtor;

public class Construtor {
    //Metodo especial dentro de uma classe,
    // chamado quando é criado e inicializar os atributos dentro do objeto.

    private int numero;



    public Construtor(int numero, String text) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
