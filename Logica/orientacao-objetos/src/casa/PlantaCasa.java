package casa;

public class PlantaCasa implements Construcao {

    //Anotação
    @Override
    public void contruir() {

    }

    @Override
    public void pintar(String cor) {
        System.out.println("Pintando a casa com a cor + " + cor);
    }

    @Override
    public int calcularCustoConstrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }

    //Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    @Override
    public void construir() {
        System.out.println("A casa foi construída, as características são: ");
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de quartos " + numeroQuartos);
        System.out.println("Numero de banheiros " + numeroBanheiros);
        System.out.println("Material " + material);
    }

    public void pintar() {
        System.out.println("A casa foi pintada de " + cor);
    }

    public void mudarCorParede(String novaCor) {
        cor = novaCor;
        pintar();
    }

    public int somarMetragem() {
       return metragem + numeroBanheiros + numeroQuartos;
    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiro, String mat){
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiro;
        material = mat;
        construir();
    }
}
