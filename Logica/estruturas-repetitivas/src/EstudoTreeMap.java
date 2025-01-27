import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {

    public static void main(String[] args) {

        TreeMap<String, Double> notasAlunos = new TreeMap<>();

        notasAlunos.put("Thiago", 9.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        for (String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " : " + nota);
        }

        for(Map.Entry<String, Double> notaa : notasAlunos.entrySet()) {
            String nome = notaa.getKey();
            double valorNota = notaa.getValue();
            System.out.println(nome + " : " + valorNota);
        }

        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        System.out.println("Ultima chave: " + notasAlunos.lastKey());
    }
}
