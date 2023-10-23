package pessoa;

public class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    String imprimir(){
        System.out.println(super.imprimir());
        return "Aluno";
    }
}
