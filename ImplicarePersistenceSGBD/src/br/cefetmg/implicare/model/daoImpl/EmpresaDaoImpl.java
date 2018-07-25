/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.daoImpl;

import br.cefetmg.implicare.dao.EmpresaDao;
import br.cefetmg.implicare.model.domain.Empresa;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class EmpresaDaoImpl implements EmpresaDao {

    @Override
    public void insert(Empresa Empresa) throws PersistenceException {
       try {
            if (Empresa == null) {
                throw new PersistenceException("Entidade não pode ser nula.");
            }
            Long Seq_Empresa;
                    
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/implicare", "postgres", "123456");

            String sql = "INSERT INTO Empresa (CNPJ, Nom_Razao_Social, Nome_Fantasia"
                    + "VALUES(?,?,?) RETURNING Seq_Empresa";

            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setLong(1, Empresa.getCNPJ());
            ps.setString(2, Empresa.getNom_Razao_Social());
            ps.setString(3, Empresa.getNome_Fantasia());
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Seq_Empresa = rs.getLong("Seq_Empresa");
            }

            rs.close();
            ps.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }

    @Override
    public boolean update(Long CNPJ, Empresa Empresa) throws PersistenceException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/comprasevendas", "postgres", "123");
            
            String SQL = "UPDATE Empresa SET Nom_Razao_Social, Nom_Fantasia"
                    + "WHERE CNPJ = ?";
            
            PreparedStatement ps = connection.prepareStatement(SQL);
            
            ps.setString(1, Empresa.getNom_Razao_Social());
            ps.setString(2, Empresa.getNome_Fantasia());
            ps.setLong(3, CNPJ);
            
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
    public Empresa getEmpresaCod(Long CNPJ) throws PersistenceException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/comprasevendas", "postgres", "123");

            String sql = "SELECT * FROM Empresa WHERE CNPJ = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, CNPJ);
            ResultSet rs = ps.executeQuery();

            Empresa Empr = new Empresa();
            
            if (rs.next()) {
                Empr.setCNPJ(rs.getLong("CNPJ"));
                Empr.setNom_Razao_Social(rs.getString("Nom_Razao_Social"));
                Empr.setNome_Fantasia(rs.getString("Nome_Fantasia"));
            }

            rs.close();
            ps.close();
            connection.close();

            return Empr;
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
}
