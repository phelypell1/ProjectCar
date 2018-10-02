/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ModelDao;

import br.com.Connection.ConnectionJava;
import br.com.ModelBeans.ManutencaoBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author phelype
 */
public class ManutencaoDao {
    
    public void SalveManut(ManutencaoBeans m){
        Connection conn = ConnectionJava.getConnection();
        PreparedStatement stmt = null;
        
        try {
           stmt = conn.prepareStatement("insert into Manutencao(osManutencao, veiculoId,dataEntrada,entradaKm,infManutencao,oficinaId,totalGasto,numNotaFiscal) values(?,?,?,?,?,?,?,?) ");
           stmt.setInt(1, m.getOsManutencao());
           stmt.setInt(2, m.getVeiculoId().getIdCarro());
           stmt.setString(3, m.getDataEntrada());
           stmt.setString(4, m.getEntradaKm());
           stmt.setString(5, m.getInfManutencao());
           stmt.setInt(6, m.getOficinaId().getIdOdicina());
           stmt.setDouble(7, m.getTotalGasto());
           stmt.setString(8, m.getNumNotaFiscal());
           stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro desconhecido !\n Entre em contato com o suporte para resolver.\n" +ex);
            ex.getMessage();
        }
    }
}
