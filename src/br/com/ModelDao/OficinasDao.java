package br.com.ModelDao;

import br.com.Connection.ConnectionJava;
import br.com.ModelBeans.OficinasBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class OficinasDao {

    public List<OficinasBeans> OficinaRead() {
        Connection con = ConnectionJava.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<OficinasBeans> OficinasRead = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from Oficinas order by nomeOficina");
            rs = pst.executeQuery();

            while (rs.next()) {
                OficinasBeans ofic = new OficinasBeans();
                ofic.setIdOdicina(rs.getInt("idOficina"));
                ofic.setNomeOficina(rs.getString("nomeOficina"));
                OficinasRead.add(ofic);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'Table.Oficinas'");
        }
        return OficinasRead;
    }
}
