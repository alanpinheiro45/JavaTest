
package com.example.testeAPISigaBem;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import java.util.Date;

@Entity
public class MainOutput {
    @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  public Integer id;

    public double vlTotalFrete;
    public String dataPrevistaEntrega;
    public String cepOrigem;
    public String cepDestino;
    public double peso;
    public String nomeDestinatario;
    public String dataConsulta;

    public MainOutput(double vlTotalFrete, String dataPrevistaEntrega, String cepOrigem, String cepDestino, double peso, String nomeDestinatario, String dataConsulta) {
        
        this.vlTotalFrete = vlTotalFrete;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
        this.peso = peso;
        this.nomeDestinatario = nomeDestinatario;
        this.dataConsulta = dataConsulta;
    }
    public MainOutput(){

      
    }

    
}
