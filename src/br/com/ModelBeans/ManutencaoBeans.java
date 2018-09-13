/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ModelBeans;

public class ManutencaoBeans {
    private int idManutencao;
    private String ultimaManut;
    private DadosCarroBeans carroIds;
    private String manutencaoKm;
    private String dataManu;
    private String dadosManu;
    private OficinasBeans oficinaId;
    private String endereco;
    private CidadeBeans cidadeId;
    private EstadoBeans estadoId;
    private double gastoTotal;

    public ManutencaoBeans() {
    }

    public ManutencaoBeans(int idManutencao, String ultimaManut, DadosCarroBeans carroIds, String manutencaoKm, String dataManu, String dadosManu, OficinasBeans oficinaId, String endereco, CidadeBeans cidadeId, EstadoBeans estadoId, double gastoTotal) {
        this.idManutencao = idManutencao;
        this.ultimaManut = ultimaManut;
        this.carroIds = carroIds;
        this.manutencaoKm = manutencaoKm;
        this.dataManu = dataManu;
        this.dadosManu = dadosManu;
        this.oficinaId = oficinaId;
        this.endereco = endereco;
        this.cidadeId = cidadeId;
        this.estadoId = estadoId;
        this.gastoTotal = gastoTotal;
    }

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
     * @return the ultimaManut
     */
    public String getUltimaManut() {
        return ultimaManut;
    }

    /**
     * @param ultimaManut the ultimaManut to set
     */
    public void setUltimaManut(String ultimaManut) {
        this.ultimaManut = ultimaManut;
    }

    /**
     * @return the carroIds
     */
    public DadosCarroBeans getCarroIds() {
        return carroIds;
    }

    /**
     * @param carroIds the carroIds to set
     */
    public void setCarroIds(DadosCarroBeans carroIds) {
        this.carroIds = carroIds;
    }

    /**
     * @return the manutencaoKm
     */
    public String getManutencaoKm() {
        return manutencaoKm;
    }

    /**
     * @param manutencaoKm the manutencaoKm to set
     */
    public void setManutencaoKm(String manutencaoKm) {
        this.manutencaoKm = manutencaoKm;
    }

    /**
     * @return the dataManu
     */
    public String getDataManu() {
        return dataManu;
    }

    /**
     * @param dataManu the dataManu to set
     */
    public void setDataManu(String dataManu) {
        this.dataManu = dataManu;
    }

    /**
     * @return the dadosManu
     */
    public String getDadosManu() {
        return dadosManu;
    }

    /**
     * @param dadosManu the dadosManu to set
     */
    public void setDadosManu(String dadosManu) {
        this.dadosManu = dadosManu;
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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cidadeId
     */
    public CidadeBeans getCidadeId() {
        return cidadeId;
    }

    /**
     * @param cidadeId the cidadeId to set
     */
    public void setCidadeId(CidadeBeans cidadeId) {
        this.cidadeId = cidadeId;
    }

    /**
     * @return the estadoId
     */
    public EstadoBeans getEstadoId() {
        return estadoId;
    }

    /**
     * @param estadoId the estadoId to set
     */
    public void setEstadoId(EstadoBeans estadoId) {
        this.estadoId = estadoId;
    }

    /**
     * @return the gastoTotal
     */
    public double getGastoTotal() {
        return gastoTotal;
    }

    /**
     * @param gastoTotal the gastoTotal to set
     */
    public void setGastoTotal(double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }
    
    
    
}
