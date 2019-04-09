package br.com.digitalhouse;

public class Cliente {

    private String nomeCliente;
    private String sobreNome;



    public String getNomeCliente(){
        return nomeCliente;
    }
    public void setNomeCliente (String novoNomeCliente) {
        nomeCliente = novoNomeCliente;
    }


    public String getSobreNome (){
        return sobreNome;
    }
    public void setSobreNome(String novoSobrenomeCliente){
        sobreNome = novoSobrenomeCliente;
    }

}
