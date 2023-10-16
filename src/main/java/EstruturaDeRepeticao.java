import javax.sound.midi.Soundbank;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        int dadoDoTipoInt = 10; //valor inteiro com quebra.
        double dadoDoTipoDouble = 3.50; //valores flutuantes
        float dadoDoTipoFloat = 1.0f; // valores flutuantes
        long dadoDoTipoLong = 100000L; // inteiro com valores maiores (longos)
        //if/else -
        if (dadoDoTipoInt == 10) {
            System.out.println("Entrou no Tipo int");
        } if (dadoDoTipoLong >= 100000) {
            System.out.println("Entrou no Tipo long " + dadoDoTipoLong);

        }else {
            System.out.println("Entrou no Tipo double" + dadoDoTipoDouble);
        }

        System.out.println("--------------------------------------------");


        //While (Enquanto for verdadeiro faça alguma coisa)
        int valorInicial = 0;
        while (valorInicial < 3) {
            valorInicial++; //valorInicial = 3
            System.out.println("O valor inicial é menor que 3");
            System.out.println(valorInicial);
        }
        System.out.println("Saiu do while");
        System.out.println("--------------------------------------------");

        //For

        for (int i = 0; i < 4; i++) {
            System.out.println("O valor do i é: " + i);
        }
        System.out.println("Finalizando o For");

    }
}
