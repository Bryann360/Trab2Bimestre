/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.daoImpl;

import br.cefetmg.implicare.dao.VagaDao;
import br.cefetmg.implicare.model.domain.Vaga;
import br.cefetmg.implicare.model.exception.PersistenceException;
import br.cefetmg.inf.util.db.JDBCConnectionManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class VagaDaoImpl implements VagaDao{
    
    @Override
    public void insert(Vaga Vaga) throws PersistenceException{
        try {
            if (Vaga == null) {
                throw new PersistenceException("Entidade não pode ser nula.");
            }
            Long Seq_Vaga;
                    
            Connection connection = JDBCConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO Vaga (CNPJ, Cod_Cargo, Dat_Publicacao, Num_Vagas,"
                    + "Carga_Horaria, Remuneracao, Desc_Vaga, Status_Vaga) "
                    + "VALUES(?,?,?,?,?,?,?,?) RETURNING Seq_Vaga";

            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setLong(1, Vaga.getCNPJ());
            ps.setInt(2, Vaga.getCod_Cargo());
            ps.setDate(3, Vaga.getDat_Publicacao());
            ps.setInt(4, Vaga.getNum_Vagas());
            ps.setInt(5, Vaga.getCarga_Horaria());
            ps.setDouble(6, Vaga.getRemuneracao());
            ps.setString(7, Vaga.getDesc_Vaga());
            ps.setInt(8, Vaga.getStatus_Vaga());
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Seq_Vaga = rs.getLong("Seq_Vaga");
            }

            rs.close();
            ps.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }
    
    @Override
    public boolean update(long CNPJ, int Cod_Cargo, Date Dat_Publicacao,Vaga Vaga) throws PersistenceException{
        try {
            Connection connection = JDBCConnectionManager.getInstance().getConnection();
            
            String SQL = "UPDATE Vaga SET Cod_Cargo = ?, Num_Vagas = ?, Carga_Horaria = ?,"
                    + "Remuneracao = ?, Desc_Vaga = ?, Status_Vaga = ?"
                    + " WHERE CNPJ = ?, Cod_Cargo = ?, Dat_Publicacao = ?";
            
            PreparedStatement ps = connection.prepareStatement(SQL);
       
            ps.setInt(1, Vaga.getCod_Cargo());
            ps.setInt(2, Vaga.getNum_Vagas());
            ps.setInt(3, Vaga.getCarga_Horaria());
            ps.setDouble(4, Vaga.getRemuneracao());
            ps.setString(5, Vaga.getDesc_Vaga());
            ps.setInt(6, Vaga.getStatus_Vaga());
            ps.setLong(7, CNPJ);
            ps.setInt(8, Cod_Cargo);
            ps.setDate(9, Dat_Publicacao);
            
            ps.executeQuery(SQL);
            ps.close();
            connection.close();
            return true;
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    @Override
    public boolean delete(long CNPJ, int Cod_Cargo, Date Dat_Publicacao) throws PersistenceException{
        try {
            Connection connection = JDBCConnectionManager.getInstance().getConnection();
            
            String SQL = "DELETE FROM Vaga"
                    + "WHERE CNPJ = ?, Cod_Cargo = ?, Dat_Publicacao = ?";
            
            PreparedStatement ps = connection.prepareStatement(SQL);
            
            ps.setLong(1, CNPJ);
            ps.setInt(2, Cod_Cargo);
            ps.setDate(3, Dat_Publicacao);
            
            ps.executeQuery(SQL);
            ps.close();
            connection.close();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    @Override
    public List<Vaga> getVagaCod_Cargo(int Cod_Cargo) throws PersistenceException{
        return null;
        
    }
    @Override
    public Vaga getVagaCod(long CNPJ, int Cod_Cargo, Date Dat_Publicacao) throws PersistenceException{return null;
    
    }
}
