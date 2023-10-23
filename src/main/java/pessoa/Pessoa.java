package pessoa;

public class Pessoa {
    private String name;
    private String id;
    private int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Metodo sem retorno, somente com ação dentro da classe
    String imprimir() {
     return "O nome da pessoa é: " + name +
             "  a idade é: " + age + " e o documento: " + id;
    }

}
