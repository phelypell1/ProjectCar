
package br.com.ModelBeans;

public class OficinasBeans {
    
    private int idOdicina;
    private String nomeOficina;
    private String endereco;
    private boolean ativa;

    public OficinasBeans() {
    }

    public OficinasBeans(int idOdicina, String nomeOficina, String endereco, boolean ativa) {
        this.idOdicina = idOdicina;
        this.nomeOficina = nomeOficina;
        this.endereco = endereco;
        this.ativa = ativa;
    }

    /**
     * @return the idOdicina
     */
    public int getIdOdicina() {
        return idOdicina;
    }

    /**
     * @param idOdicina the idOdicina to set
     */
    public void setIdOdicina(int idOdicina) {
        this.idOdicina = idOdicina;
    }

    /**
     * @return the nomeOficina
     */
    public String getNomeOficina() {
        return nomeOficina;
    }

    /**
     * @param nomeOficina the nomeOficina to set
     */
    public void setNomeOficina(String nomeOficina) {
        this.nomeOficina = nomeOficina;
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
     * @return the ativa
     */
    public boolean isAtiva() {
        return ativa;
    }

    /**
     * @param ativa the ativa to set
     */
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public String toString() {
        return getNomeOficina();
    }
}
