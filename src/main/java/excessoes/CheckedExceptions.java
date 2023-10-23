package excessoes;

public class CheckedExceptions {

    //Checked exceptions: compilador do java exige que vc trate

    //Unchecked exceptions: nao tem controle, nao verificados, nao sabe que ira dar um erro.

    public static void main(String[] args) {
        //try /catch
        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O numero é maior que 100");
        }
    }
}
