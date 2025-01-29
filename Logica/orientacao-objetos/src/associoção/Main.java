package associoção;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Funcionarios joao = new Funcionarios("João");
        Funcionarios joana = new Funcionarios("Joana");
        Funcionarios matheus = new Funcionarios("Matheus");
        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(joana);
        listaDeFuncionarios.add(joao);
        listaDeFuncionarios.add(matheus);

        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostrarFuncionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();
    }
}
