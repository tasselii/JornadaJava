import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class EntradaSaidaDeDados {

    public static void main(String[] args) {

    /*
        System.out.println("Impressão | Pulo a linha")
        System.out.print("Impressão | Tudo na mesma linha");
        System.out.printf("Impressão | Formatada");
     */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Idade: " + idade);
    }
}
