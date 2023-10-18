package primeirasAulas;

import java.util.HashSet;
import java.util.Set;

public class ColettionHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        numeros.remove(10);
        numeros.remove(40);


        for (Integer elementos : numeros) {
            System.out.println(elementos);
        }

        System.out.println(numeros.size());
        System.out.println(numeros.contains(10));
    }
}
