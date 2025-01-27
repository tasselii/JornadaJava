import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a nota 2: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a nota 3: ");
        double n3 = scanner.nextDouble();
        System.out.println("Digite a nota 4: ");
        double n4 = scanner.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 6) {
            System.out.println("APROVADO");
        } else if (media == 5) {
            System.out.println("RECUPERAÇÃO");
        }
        else System.out.println("REPROVADO");
    }
}
