package pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId("113141545");
        pessoa.setName("Mateus");
        pessoa.setAge(29);
        System.out.println(pessoa.imprimir());

        Professor professor = new Professor();
        professor.setId  ("113141545");
        professor.setName  ("Jaque");
        professor.setAge  (28);
        professor.setSalario(5000);
        System.out.println(professor.imprimirProfessor());

        Aluno aluno = new Aluno();
        aluno.setId("22244442");
        aluno.setName("Joao");
        aluno.setAge(29);
        aluno.setMatricula("14423");
        System.out.println(aluno.imprimir());


    }
}
