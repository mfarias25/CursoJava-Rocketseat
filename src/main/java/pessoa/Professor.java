package pessoa;

public class Professor extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    //Sobrescreveu o metodo imprimir
    String imprimir(){
        System.out.println(super.imprimir());
    return "Professor";
    }
}
