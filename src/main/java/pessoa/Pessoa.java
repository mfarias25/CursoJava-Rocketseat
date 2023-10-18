package pessoa;

public class Pessoa {
    String name;
    String id;
    int age;

    //Metodo sem retorno, somente com ação dentro da classe
    String imprimir() {
     return "O nome da pessoa é: " + name +
             "  a idade é: " + age + " e o documento: " + id;
    }

}
