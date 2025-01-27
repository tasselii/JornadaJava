package conta;

public class Agencia {

    public static void main(String[] args) {

        ContaBancaria minhaConta  = new ContaBancaria("Tiago", 500);

        minhaConta.setTitular("Thiago Tasseli");
        minhaConta.setSaldo(minhaConta.getSaldo() + 2000);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("Titular: " + titularConta);
        System.out.println("Saldo: " + saldoFinal);

        ContaBancaria contaMinhaMae = new ContaBancaria("Ana", 500);

        contaMinhaMae.setTitular("Ana Ribeiro");

        String titularConta2 = contaMinhaMae.getTitular();
        double saldoFinal2 = contaMinhaMae.getSaldo();

        System.out.println(" ");
        System.out.println("Titular: " + titularConta2);
        System.out.println("Saldo: " + saldoFinal2);

    }
}
