import javax.sound.midi.Soundbank;

public class TrabalhandoComStrings {

    public static void main(String[] args) {

    String nome = "Thiago";
    String sobrenome = " Tasseli";
    String nomeDois = "Matheus";

    int tamanhoString = nome.length();
    boolean saoIguais = nome.equals(nomeDois);
    String nomeCompleto = nome.concat(sobrenome);


        System.out.println("Olá " + nome.toUpperCase() + " seu nome tem " + tamanhoString + " caracteres");
        System.out.println("Os nomes são iguais: " + saoIguais);
        System.out.println("Nome completo: " + nomeCompleto);
    }
}
