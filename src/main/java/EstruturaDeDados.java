import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // Lista
        //Interface nao conseguimos manipular, pois so tem os metodos disponivels no contrato
        //ArrayList = Classe de implementação
        List<String> listaDeNomes = new ArrayList<String>();
        listaDeNomes.add("Mateus"); //[0]
        listaDeNomes.add("Jaque"); //[1]
        listaDeNomes.add("Jao"); //[2]

        System.out.println(listaDeNomes.get(0));
        System.out.println("--------------------------------");

        for (String nome:listaDeNomes) {
            System.out.println("O nome é: " + nome);
        }
        System.out.println("--------------------------------");

        listaDeNomes.forEach(nome ->
                System.out.println("O nome que apareceu foi: " + nome));

        System.out.println("--------------------------------");

        //Printando somente = listaDeNomes.forEach(System.out::println);





    }

}
