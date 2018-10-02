/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ModelBeans;

public class ManutencaoBeans {
   private int idManutencao;
   private int osManutencao;
   private DadosCarroBeans veiculoId;
   private String dataEntrada;
   private String entradaKm;
   private String infManutencao;
   private OficinasBeans oficinaId;
   private double totalGasto;
   private String numNotaFiscal;

    /**
     * @return the idManutencao
     */
    public int getIdManutencao() {
        return idManutencao;
    }

    /**
     * @param idManutencao the idManutencao to set
     */
    public void setIdManutencao(int idManutencao) {
        this.idManutencao = idManutencao;
    }

    /**
     * @return the osManutencao
     */
    public int getOsManutencao() {
        return osManutencao;
    }

    /**
     * @param osManutencao the osManutencao to set
     */
    public void setOsManutencao(int osManutencao) {
        this.osManutencao = osManutencao;
    }

    /**
     * @return the veiculoId
     */
    public DadosCarroBeans getVeiculoId() {
        return veiculoId;
    }

    /**
     * @param veiculoId the veiculoId to set
     */
    public void setVeiculoId(DadosCarroBeans veiculoId) {
        this.veiculoId = veiculoId;
    }

    /**
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the entradaKm
     */
    public String getEntradaKm() {
        return entradaKm;
    }

    /**
     * @param entradaKm the entradaKm to set
     */
    public void setEntradaKm(String entradaKm) {
        this.entradaKm = entradaKm;
    }

    /**
     * @return the infManutencao
     */
    public String getInfManutencao() {
        return infManutencao;
    }

    /**
     * @param infManutencao the infManutencao to set
     */
    public void setInfManutencao(String infManutencao) {
        this.infManutencao = infManutencao;
    }

    /**
     * @return the oficinaId
     */
    public OficinasBeans getOficinaId() {
        return oficinaId;
    }

    /**
     * @param oficinaId the oficinaId to set
     */
    public void setOficinaId(OficinasBeans oficinaId) {
        this.oficinaId = oficinaId;
    }

    /**
     * @return the totalGasto
     */
    public double getTotalGasto() {
        return totalGasto;
    }

    /**
     * @param totalGasto the totalGasto to set
     */
    public void setTotalGasto(double totalGasto) {
        this.totalGasto = totalGasto;
    }

    /**
     * @return the numNotaFiscal
     */
    public String getNumNotaFiscal() {
        return numNotaFiscal;
    }

    /**
     * @param numNotaFiscal the numNotaFiscal to set
     */
    public void setNumNotaFiscal(String numNotaFiscal) {
        this.numNotaFiscal = numNotaFiscal;
    }

}
