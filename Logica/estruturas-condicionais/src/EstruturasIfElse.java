import java.util.Scanner;

public class EstruturasIfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        }
        else System.out.println("Você é menor de idade");

        System.out.println("--------------------------------");

        boolean estaChovendo = true;

        if (!estaChovendo) {
            System.out.println("Vamos sair para passear");
        } else
            System.out.println("Vamos ficar em casa");
    }
}

