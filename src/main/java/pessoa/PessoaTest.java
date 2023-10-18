package pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.id = "113141545";
        pessoa.name = "Mateus";
        pessoa.age = 29;
        System.out.println(pessoa);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.id = "113141545";
        pessoa2.name = "Jaque";
        pessoa2.age = 28;

        System.out.println(pessoa2.imprimir());
    }
}
