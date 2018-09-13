
package br.com.ModelDao;

import br.com.Connection.ConnectionJava;
import br.com.ModelBeans.ModeloVeiculoBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ModeloVeiculoDao {
    
    public List<ModeloVeiculoBeans> Read(){
        Connection con = ConnectionJava.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        List<ModeloVeiculoBeans> modeloVeiculo = new ArrayList<>();
        
        try {
            pst =  con.prepareStatement("select * from ModeloVeiculo");
            rs = pst.executeQuery();
            
            while (rs.next()) {
                ModeloVeiculoBeans modelVei = new ModeloVeiculoBeans();
                
                modelVei.setIdModelo(rs.getInt("idModelo"));
                modelVei.setNomeModelo(rs.getString("modelo"));
                modeloVeiculo.add(modelVei);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela !"+e.getMessage());
        }
        finally{
            ConnectionJava.CloseConection(con, pst, rs);
        }
        
        return modeloVeiculo;
    }   
}
