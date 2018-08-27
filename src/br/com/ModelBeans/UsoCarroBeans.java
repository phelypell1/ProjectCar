
package br.com.ModelBeans;

public class UsoCarroBeans { 
    
    private int idUso;
    private DadosCarroBeans carroId;
    private String kmInicial;
    private String kmFinal;
    private String dataSaida;
    private String dataChegada;
    private UtilCarroBeans usuarioCarro;

    public UsoCarroBeans() {
    }

    public UsoCarroBeans(int idUso, DadosCarroBeans carroId, String kmInicial, String kmFinal, String dataSaida, String dataChegada, UtilCarroBeans usuarioCarro) {
        this.idUso = idUso;
        this.carroId = carroId;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
        this.usuarioCarro = usuarioCarro;
    }

    /**
     * @return the idUso
     */
    public int getIdUso() {
        return idUso;
    }

    /**
     * @param idUso the idUso to set
     */
    public void setIdUso(int idUso) {
        this.idUso = idUso;
    }

    /**
     * @return the carroId
     */
    public DadosCarroBeans getCarroId() {
        return carroId;
    }

    /**
     * @param carroId the carroId to set
     */
    public void setCarroId(DadosCarroBeans carroId) {
        this.carroId = carroId;
    }

    /**
     * @return the kmInicial
     */
    public String getKmInicial() {
        return kmInicial;
    }

    /**
     * @param kmInicial the kmInicial to set
     */
    public void setKmInicial(String kmInicial) {
        this.kmInicial = kmInicial;
    }

    /**
     * @return the kmFinal
     */
    public String getKmFinal() {
        return kmFinal;
    }

    /**
     * @param kmFinal the kmFinal to set
     */
    public void setKmFinal(String kmFinal) {
        this.kmFinal = kmFinal;
    }

    /**
     * @return the dataSaida
     */
    public String getDataSaida() {
        return dataSaida;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    /**
     * @return the dataChegada
     */
    public String getDataChegada() {
        return dataChegada;
    }

    /**
     * @param dataChegada the dataChegada to set
     */
    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    /**
     * @return the usuarioCarro
     */
    public UtilCarroBeans getUsuarioCarro() {
        return usuarioCarro;
    }

    /**
     * @param usuarioCarro the usuarioCarro to set
     */
    public void setUsuarioCarro(UtilCarroBeans usuarioCarro) {
        this.usuarioCarro = usuarioCarro;
    }
    
    
    
    
}
