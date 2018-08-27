
package br.com.ModelBeans;


public class UtilCarroBeans {
    
    private int idUtilizador;
    private String nomeUtilizador;
    private int cnh;
    private String VencCnh;
    private boolean ativoMot;

    public UtilCarroBeans() {
    }

    public UtilCarroBeans(int idUtilizador, String nomeUtilizador, int cnh, String VencCnh, boolean ativoMot) {
        this.idUtilizador = idUtilizador;
        this.nomeUtilizador = nomeUtilizador;
        this.cnh = cnh;
        this.VencCnh = VencCnh;
        this.ativoMot = ativoMot;
    }

    /**
     * @return the idUtilizador
     */
    public int getIdUtilizador() {
        return idUtilizador;
    }

    /**
     * @param idUtilizador the idUtilizador to set
     */
    public void setIdUtilizador(int idUtilizador) {
        this.idUtilizador = idUtilizador;
    }

    /**
     * @return the nomeUtilizador
     */
    public String getNomeUtilizador() {
        return nomeUtilizador;
    }

    /**
     * @param nomeUtilizador the nomeUtilizador to set
     */
    public void setNomeUtilizador(String nomeUtilizador) {
        this.nomeUtilizador = nomeUtilizador;
    }

    /**
     * @return the cnh
     */
    public int getCnh() {
        return cnh;
    }

    /**
     * @param cnh the cnh to set
     */
    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    /**
     * @return the VencCnh
     */
    public String getVencCnh() {
        return VencCnh;
    }

    /**
     * @param VencCnh the VencCnh to set
     */
    public void setVencCnh(String VencCnh) {
        this.VencCnh = VencCnh;
    }

    /**
     * @return the ativoMot
     */
    public boolean isAtivoMot() {
        return ativoMot;
    }

    /**
     * @param ativoMot the ativoMot to set
     */
    public void setAtivoMot(boolean ativoMot) {
        this.ativoMot = ativoMot;
    }
    
    
}
