package br.com.digitalhouse;

public class Exercicio1 {

    public static void main(String[] args) {

        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        Conta contaCli1 = new Conta();
        Conta contaCli2 = new Conta();

        cli1.setNomeCliente("Paulo");
        cli1.setSobreNome("Weigand");
        contaCli1.setNumeroDaConta(100);
        contaCli1.setTitular(cli1);

        cli2.setNomeCliente("Fernando");
        cli2.setSobreNome("Tavares");
        contaCli2.setNumeroDaConta(200);
        contaCli2.setTitular(cli2);


       contaCli1.deposito(25);
       contaCli1.saque(100);

       contaCli2.deposito(100);
       contaCli2.saque(20);




    }



}
