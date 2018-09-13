
package br.com.ModelDao;

import br.com.Connection.ConnectionJava;
import br.com.ModelBeans.EstadoBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EstadoDao {
    
    public List<EstadoBeans> EstadosRead() {
        Connection con = ConnectionJava.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<EstadoBeans> estadoRead = new ArrayList<>();

        try {
            pst = con.prepareStatement("select IdEstado,sigla from Estados");
            rs = pst.executeQuery();

            while (rs.next()) {
                EstadoBeans ofic = new EstadoBeans();
                ofic.setIdEstado(rs.getInt("idEstado"));
                ofic.setSiglaEst(rs.getString("sigla"));
                estadoRead.add(ofic);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Estados'");
        }
        return estadoRead;
    }
    
}
