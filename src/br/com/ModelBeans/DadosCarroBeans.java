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
public class DadosCarroBeans {
    private int idCarro;
    private String codCarro;
    private MarcaVeiculoBeans marcaId;
    private ModeloVeiculoBeans modeloId;
    private String anoFabricacao;
    private String dataAquisicao;
    private String placaCarro;
    private String chassiVeic;
    private StatusBeans statusId;

    public DadosCarroBeans() {
    }

    
    /**
     * @return the idCarro
     */
    public int getIdCarro() {
        return idCarro;
    }

    /**
     * @param idCarro the idCarro to set
     */
    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    /**
     * @return the codCarro
     */
    public String getCodCarro() {
        return codCarro;
    }

    /**
     * @param codCarro the codCarro to set
     */
    public void setCodCarro(String codCarro) {
        this.codCarro = codCarro;
    }

    /**
     * @return the marcaId
     */
    public MarcaVeiculoBeans getMarcaId() {
        return marcaId;
    }

    /**
     * @param marcaId the marcaId to set
     */
    public void setMarcaId(MarcaVeiculoBeans marcaId) {
        this.marcaId = marcaId;
    }

    /**
     * @return the modeloId
     */
    public ModeloVeiculoBeans getModeloId() {
        return modeloId;
    }

    /**
     * @param modeloId the modeloId to set
     */
    public void setModeloId(ModeloVeiculoBeans modeloId) {
        this.modeloId = modeloId;
    }

    /**
     * @return the anoFabricacao
     */
    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    /**
     * @param anoFabricacao the anoFabricacao to set
     */
    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    /**
     * @return the dataAquisicao
     */
    public String getDataAquisicao() {
        return dataAquisicao;
    }

    /**
     * @param dataAquisicao the dataAquisicao to set
     */
    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    /**
     * @return the placaCarro
     */
    public String getPlacaCarro() {
        return placaCarro;
    }

    /**
     * @param placaCarro the placaCarro to set
     */
    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    /**
     * @return the chassiVeic
     */
    public String getChassiVeic() {
        return chassiVeic;
    }

    /**
     * @param chassiVeic the chassiVeic to set
     */
    public void setChassiVeic(String chassiVeic) {
        this.chassiVeic = chassiVeic;
    }

    /**
     * @return the statusId
     */
    public StatusBeans getStatusId() {
        return statusId;
    }

    /**
     * @param statusId the statusId to set
     */
    public void setStatusId(StatusBeans statusId) {
        this.statusId = statusId;
    }

    @Override
    public String toString() {
        String String;
        return getCodCarro();
    }
    /*public int toString(){
        return getIdCarro();
        
    }*/
}
