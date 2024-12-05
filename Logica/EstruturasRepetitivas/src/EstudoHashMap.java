import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {

    public static void main(String[] args) {

        HashMap<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("Thiago", 9.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        for (String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " : " + nota);
        }

       double nota = notasAlunos.get("Thiago");

        System.out.println("A nota do Thiago é " + nota);

        for(Map.Entry<String, Double> notaa : notasAlunos.entrySet()) {
            String nome = notaa.getKey();
            double valorNota = notaa.getValue();
            System.out.println(nome + " : " + valorNota);
        }

            int tamanho = notasAlunos.size();

            notasAlunos.remove("Thiago");
    }
}
