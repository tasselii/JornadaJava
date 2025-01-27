public class Variaveis {

    public static void main(String[] args) {
        double nota1 = 6.4;
        double nota2 = 10;
        double nota3 = 10;
        double nota4 = 10;
        double notaSomada = nota1 + nota2 + nota3 + nota4;
        double media = notaSomada / 4;

        if (media >= 6) {
            System.out.println("---- Aprovado ----");
        } else if (media < 6) {
            System.out.println("---- Reprovado ----");
        }

        System.out.println("A média do aluno é de: " + media);
    }
}
