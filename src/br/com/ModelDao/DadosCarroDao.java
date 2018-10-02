package br.com.ModelDao;

import br.com.Connection.ConnectionJava;
import br.com.ModelBeans.DadosCarroBeans;
import br.com.ModelBeans.MarcaVeiculoBeans;
import br.com.ModelBeans.ModeloVeiculoBeans;
import br.com.ModelBeans.StatusBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DadosCarroDao {
    
    public List<DadosCarroBeans> ReadTable(){
        Connection con = ConnectionJava.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        List<DadosCarroBeans> dadosCarros = new ArrayList<>();
        
        
        try {
            pst = con.prepareStatement("select idCarro, codCarro, marca, modelo, anoFab, dataAquisicao,placaCarro,chassi, nomeStatus from DadosCarro\n" +
"inner join MarcaVeiculo on marcaVeicId = idMarca\n" +
"inner join ModeloVeiculo on modeloveicId = idModelo\n" +
"inner join StatusGeral on statusId = idStatus;");
            rs = pst.executeQuery();
            
            while (rs.next()) {
                DadosCarroBeans table = new DadosCarroBeans();
                
                table.setIdCarro(rs.getInt("idCarro"));
                
                table.setCodCarro(rs.getString("codCarro"));

                MarcaVeiculoBeans marca = new MarcaVeiculoBeans();
                marca.setNomeMarca(rs.getString("marca"));
                table.setMarcaId(marca);
                
                ModeloVeiculoBeans modelo = new ModeloVeiculoBeans();
                modelo.setNomeModelo(rs.getString("modelo"));
                table.setModeloId(modelo);
                
                table.setAnoFabricacao(rs.getString("anoFab"));
                table.setDataAquisicao(rs.getString("dataAquisicao"));
                table.setPlacaCarro(rs.getString("placaCarro"));
                table.setChassiVeic(rs.getString("chassi"));
                
                StatusBeans sta = new StatusBeans();
                sta.setNomeStatus(rs.getString("nomeStatus"));
                table.setStatusId(sta);
                
                dadosCarros.add(table);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Preencher table" +e.getMessage());
        }
        return dadosCarros;
    }
     
    public void InsertDados(DadosCarroBeans carros){
        Connection conn = ConnectionJava.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("insert into DadosCarro (codCarro,marcaVeicId,modeloveicId,anoFab,dataAquisicao,placaCarro,chassi,statusId) values(?,?,?,?,?,?,?,?)");
            stmt.setString(1, carros.getCodCarro());
            stmt.setInt(2, carros.getMarcaId().getIdMarca());
            stmt.setInt(3, carros.getModeloId().getIdModelo());
            stmt.setString(4, carros.getAnoFabricacao());
            stmt.setString(5, carros.getDataAquisicao());
            stmt.setString(6, carros.getPlacaCarro());
            stmt.setString(7, carros.getChassiVeic());
            stmt.setInt(8, carros.getStatusId().getIdStatus());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "SUCESS");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro Desconhecido.\n" +ex.getMessage());
        }
        
    }
    
    public List<DadosCarroBeans> ReadCarroNome(){
        Connection con = ConnectionJava.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        List<DadosCarroBeans> carRead = new ArrayList<>();
        
        try {
            pst = con.prepareStatement("select idCarro, codCarro from DadosCarro order by codCarro ");
            rs = pst.executeQuery();
            
            while (rs.next()) {
                DadosCarroBeans status = new DadosCarroBeans();
                status.setIdCarro(rs.getInt("idCarro"));
                status.setCodCarro(rs.getString("codCarro"));
                carRead.add(status);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox"+ e.getMessage());
        }
        return carRead;
    }

    
}
