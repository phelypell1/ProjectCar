/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ModelBeans;

/**
 *
 * @author phelype
 */
public class EstadoBeans {
    private int idEstado;
    private String nomeEstado;
    private String siglaEst;

    /**
     * @return the idEstado
     */
    public int getIdEstado() {
        return idEstado;
    }

    /**
     * @param idEstado the idEstado to set
     */
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * @return the nomeEstado
     */
    public String getNomeEstado() {
        return nomeEstado;
    }

    /**
     * @param nomeEstado the nomeEstado to set
     */
    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    /**
     * @return the siglaEst
     */
    public String getSiglaEst() {
        return siglaEst;
    }

    /**
     * @param siglaEst the siglaEst to set
     */
    public void setSiglaEst(String siglaEst) {
        this.siglaEst = siglaEst;
    }

    @Override
    public String toString() {
        return getSiglaEst();
    }

   
}
