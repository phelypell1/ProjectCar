/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ModelDao;

import br.com.Connection.ConnectionJava;
import br.com.ModelBeans.StatusBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author phelype
 */
public class StatusDao {
    
    
    public List<StatusBeans> ReadStatus(){
        Connection con = ConnectionJava.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        List<StatusBeans> statusRead = new ArrayList<>();
        
        try {
            pst = con.prepareStatement("select * from StatusGeral order by nomeStatus");
            rs = pst.executeQuery();
            
            while (rs.next()) {
                StatusBeans status = new StatusBeans();
                status.setIdStatus(rs.getInt("idStatus"));
                status.setNomeStatus(rs.getString("nomeStatus"));
                statusRead.add(status);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox");
        }
        return statusRead;
    }
    
}
