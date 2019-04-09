package br.com.digitalhouse;

public class Conta {

    private Integer numeroDaConta;
    private float saldo;
    private Cliente titular;



    public void deposito(float quantia){
        saldo = saldo + quantia;
        System.out.println("Depósito realizado. Saldo atual: "+ saldo);
    }

    public void saque(float quantia){
        if(saldo < quantia) {
            System.out.println("Saldo Insuficiente");
        } else{
            saldo = saldo - quantia;
            System.out.println("Saque realizado. Saldo atual: "+ saldo);
        }

    }

    public Integer getNumeroDaConta(){
        return numeroDaConta;
    }
    public void setNumeroDaConta(Integer novoNumeroConta){
        numeroDaConta = novoNumeroConta;
    }

    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float novoSaldo){
        saldo = novoSaldo;
    }

    public String getTitular(){
        return titular.toString();
    }
    public void setTitular(Cliente novoTitular){
        titular = novoTitular ;
    }


}
