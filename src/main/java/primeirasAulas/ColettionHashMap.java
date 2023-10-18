package primeirasAulas;

import java.util.Map;

public class ColettionHashMap {

    //Map trabalha com chave única
    public static void main(String[] args) {
        Map<String, Integer> notas  = new java.util.HashMap<>();
        notas.put("Mateus", 10);
        notas.put("Jaqueline", 20);
        notas.put("Mayara", 30);

        for (Map.Entry<String, Integer> entry:notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("key: " + key + ", value: " + value);
        }

        //var nota = notas.get("Mateus");
        //System.out.println(nota);
    }
}
