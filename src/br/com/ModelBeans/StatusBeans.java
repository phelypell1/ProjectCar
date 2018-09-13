package br.com.ModelBeans;

public class StatusBeans {
 
    private int idStatus;
    private String nomeStatus;

    public StatusBeans() {
    }

    public StatusBeans(int idStatus, String nomeStatus) {
        this.idStatus = idStatus;
        this.nomeStatus = nomeStatus;
    }

    /**
     * @return the idStatus
     */
    public int getIdStatus() {
        return idStatus;
    }

    /**
     * @param idStatus the idStatus to set
     */
    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    /**
     * @return the nomeStatus
     */
    public String getNomeStatus() {
        return nomeStatus;
    }

    /**
     * @param nomeStatus the nomeStatus to set
     */
    public void setNomeStatus(String nomeStatus) {
        this.nomeStatus = nomeStatus;
    }

    @Override
    public String toString() {
        return getNomeStatus();
    }
    
    
    
}
