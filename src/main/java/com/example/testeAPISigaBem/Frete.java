package com.example.testeAPISigaBem;


public class Frete {
    public Localizacao origem;
    public Localizacao destino;

    public double vlTotalFrete;
    public String dataConsulta;
    public String dataPrevistaEntrega;
    public String cepOrigem;
    public String cepDestino;
    public double peso;
    public String nomeDestinatario;

    public Frete(double vlTotalFrete, String dataConsulta, String dataPrevistaEntrega, String cepOrigem, String cepDestino, double peso, String nomeDestinatario){
        this.vlTotalFrete = vlTotalFrete;
        this.dataConsulta = dataConsulta;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
        this.peso = peso;
        this.nomeDestinatario = nomeDestinatario;
    }

    public Frete(){

    }
}
