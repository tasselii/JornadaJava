package casa;

public class Casa {

    public static void main(String[] args) {

        //Criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        //Iniciando os atributos (variáveis) (características) casa
        casa.numeroBanheiros = 3;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = " Cinza";

        //Chamada da função (método) da ordem;
        casa.construir();

        casa.pintar();

        casa.mudarCorParede("Azul");

        casa.alterarCaracteristicas(100,2,2,"Madeira");

        int resultado = casa.somarMetragem();
        System.out.println(resultado);

        PlantaCasa casaVizinho = new PlantaCasa();

        casaVizinho.metragem = 200;
        casaVizinho.material = "Marmore";
        casaVizinho.numeroBanheiros = 1;
        casaVizinho.numeroQuartos = 1;
        casaVizinho.cor = "Amarela";

        casaVizinho.construir();
        casaVizinho.pintar();
    }
}
