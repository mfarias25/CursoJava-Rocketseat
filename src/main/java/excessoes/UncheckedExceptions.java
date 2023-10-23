package excessoes;

import pessoa.Pessoa;

public class UncheckedExceptions {

    //Checked exceptions: compilador do java exige que vc trate

    //Unchecked exceptions: nao tem controle, nao verificados, nao sabe que ira dar um erro.

    public static void main(String[] args) {
        Pessoa p = null;
        p.getId();

    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O numero é maior que 100");
        }
    }
}
