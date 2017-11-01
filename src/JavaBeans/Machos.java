/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBeans;

import java.sql.Date;

/**
 *
 * @author heito
 */
public class Machos {
    private Integer idMacho;
    private Integer numero;
    private String lote;
    private String caracteristica;
    private Date datanascimento;
    private String proprietario;
    private String nomemae;
    private Integer numeromae;
    private String situacao;

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Integer getIdMacho() {
        return idMacho;
    }

    public void setIdMacho(Integer idMacho) {
        this.idMacho = idMacho;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public Integer getNumeromae() {
        return numeromae;
    }

    public void setNumeromae(Integer numeromae) {
        this.numeromae = numeromae;
    }


    
    
}
