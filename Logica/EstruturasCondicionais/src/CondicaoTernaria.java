import java.util.Scanner;

public class CondicaoTernaria {

    public static void main(String[] args) {

        /*boolean temDinheiro = true;
        boolean temCartao = false;

        String mensagem = (temDinheiro) ? "Pede um ifood" : "Come o que tem em casa";

        System.out.println(mensagem);*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite a nota 2: ");
        int n2 = scanner.nextInt();

        int media = n1 + n2 / 2;

        String resultado = (media > 5) ? "APROVADO" : "REPROVADO";

        System.out.println(resultado);
    }
}
