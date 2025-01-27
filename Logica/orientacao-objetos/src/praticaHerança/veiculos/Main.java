package praticaHerança.veiculos;

public class Main {

    public static void main(String[] args) {

        Carro uno = new Carro();
        uno.exibirDetalhes("Fiat", "Uno", 2010);
        uno.quantidadesPortas(2);

        System.out.println(" ");

        Moto tiger = new Moto();
        tiger.exibirDetalhes("BMW","tiger", 2025);
        tiger.cilindradas(800);
    }
}
