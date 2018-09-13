package br.com.ModelDao;

import br.com.Connection.ConnectionJava;
import br.com.ModelBeans.MarcaVeiculoBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MarcaVeiculoDao {

    public List<MarcaVeiculoBeans> ReadMarca(){
        Connection con = ConnectionJava.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        List<MarcaVeiculoBeans> marcaVeiculo = new ArrayList<>();
        
        try {
            pst = con.prepareStatement("select * from MarcaVeiculo order by marca");
            rs = pst.executeQuery();
            
            while (rs.next()) {
                MarcaVeiculoBeans modelVei = new MarcaVeiculoBeans();
                modelVei.setIdMarca(rs.getInt("idMarca"));
                modelVei.setNomeMarca(rs.getString("marca"));
                marcaVeiculo.add(modelVei);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Preencher dados");
        }
        return marcaVeiculo;
    }


}
