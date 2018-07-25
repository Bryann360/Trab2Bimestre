/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.daoImpl;

import br.cefetmg.implicare.dao.TelefoneDao;
import br.cefetmg.implicare.model.domain.Telefone;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class TelefoneDaoImpl implements TelefoneDao{
   
    @Override
    public void insert(Telefone Telefone) throws PersistenceException{
        try {
            if (Telefone == null) {
                throw new PersistenceException("Entidade não pode ser nula.");
            }
            Long Seq_Telefone;
                    
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/implicare", "postgres", "123456");

            String sql = "INSERT INTO Telefone (CPF_CNPJ, Num_Telefone, Tipo_Telefone, DDD,"
                    + "Ramal) VALUES(?,?,?,?,?) RETURNING Seq_Telefone";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, Telefone.getCPF_CNPJ());
            ps.setString(2, Telefone.getNum_Telefone());
            ps.setString(3, Telefone.getTipo_Telefone());
            ps.setInt(4, Telefone.getDDD());
            ps.setInt(5, Telefone.getRamal());
            
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Seq_Telefone = rs.getLong("Seq_Telefone");
            }

            rs.close();
            ps.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }
    @Override
    public boolean update(long CPF_CNPJ, String Num_Telefone, Telefone Telefone) throws PersistenceException{
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/comprasevendas", "postgres", "123");
            
            String SQL = "UPDATE Telefone SET Num_Telefone = ?, Tipo_Telefone = ?, DDD = ?, Ramal = ? "
                    + "WHERE CPF_CNPJ = ?, Num_Telefone = ?";
            
            PreparedStatement ps = connection.prepareStatement(SQL);
            
            ps.setString(1, Telefone.getNum_Telefone());
            ps.setString(2, Telefone.getTipo_Telefone());
            ps.setInt(3, Telefone.getDDD());
            ps.setInt(4, Telefone.getRamal());
            ps.setLong(5, CPF_CNPJ);
            ps.setString(6, Num_Telefone);
            
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
    public boolean delete(long CPF_CNPJ, String Num_Telefone) throws PersistenceException{
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/implicare", "postgres", "123456");
            
            String SQL = "DELETE FROM Telefone"
                    + "WHERE CPF_CNPJ = ?, Num_Telfone = ?";
            
            PreparedStatement ps = connection.prepareStatement(SQL);
            
            ps.setLong(1, CPF_CNPJ);
            ps.setString(2, Num_Telefone);
            
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
    public List<Telefone> getTelefone(long CPF_CNPJ, String Num_Telefone) throws PersistenceException{
        List<Telefone> ListTel;
        ListTel = null;
        Telefone Tel = new Telefone();
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/comprasevendas", "postgres", "123");
            
            String SQL = "SELECT * FROM Telefone"
                    + "WHERE CPF_CNPJ = ?, Num_Telefone = ?";
            
            PreparedStatement ps = connection.prepareStatement(SQL);
            
            ps.setLong(1, CPF_CNPJ);
            ps.setString(2, Num_Telefone);
            
            ResultSet rs = ps.executeQuery(SQL);
            while (rs.next()) {
                Tel.setCPF_CNPJ(rs.getLong("CPF_CNPJ"));
                Tel.setNum_Telefone(rs.getString("Num-Telefone"));
                Tel.setTipo_Telefone(rs.getString("Tipo_Telfone"));
                Tel.setDDD(rs.getInt("DDD"));
                Tel.setRamal(rs.getInt("Ramal"));
                ListTel.add(Tel);
            }

            rs.close();
            ps.close();
            connection.close();
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return ListTel;
    }
    
}
