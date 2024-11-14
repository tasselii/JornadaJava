public class OperadoresAritmeticos {

    public static void main(String[] args) {

        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 0.5;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - (valorTotal * desconto);

        System.out.println("Valor Total = R$" + valorTotal);
        System.out.println("Valor Total com Desconto = R$" + valorTotalComDesconto);
    }
}
