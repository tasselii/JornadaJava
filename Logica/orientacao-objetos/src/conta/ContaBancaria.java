package conta;

public class ContaBancaria {

    //Atributos privados
    private String titular;
    private Double saldo;

    //Getter e Setter - Métodos Padrões para acessar e modificar os atributos

    //Metodo para obter o titular
    public String getTitular() {
        return titular;
    }

    //Metodo para modificar o titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //Construtor - com Atributos
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Construtor - sem Atributos
    //public ContaBancaria() {
    //}

    //Construtor com 1 Atributo
    //public ContaBancaria(double saldo) {
        //this.saldo = saldo;
    //}
}
