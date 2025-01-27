package herança;

public class Main {

    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.beberAgua();
        caramelo.comer("Ração");
        caramelo.dormir();

        System.out.println(" ");

        Galinha gertrudez = new Galinha();
        gertrudez.ciscar();
        gertrudez.beberAgua();
        gertrudez.comer("Milho");
        gertrudez.dormir();
    }
}
