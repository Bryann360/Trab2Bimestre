/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.daoImpl;

import br.cefetmg.implicare.dao.PessoaFisicaDao;
import br.cefetmg.implicare.model.domain.PessoaFisica;
import br.cefetmg.implicare.model.exception.PersistenceException;
import br.cefetmg.inf.util.db.JDBCConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gabriel
 */
public class PessoaFisicaDaoImpl implements PessoaFisicaDao {

    @Override
    public void insert(PessoaFisica PessoaFisica) throws PersistenceException {
        try {
            if (PessoaFisica == null) {
                throw new PersistenceException("Entidade não pode ser nula.");
            }
            Long Seq_PessoaFisica;
                    
            Connection connection = JDBCConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO Pessoa_Fisica (CPF, Nome, Data_Nascimento) "
                    + "VALUES(?,?,?) RETURNING Seq_Telefone";

            PreparedStatement ps = connection.prepareStatement(sql);
        
            ps.setLong(1, PessoaFisica.getCPF());
            ps.setString(2, PessoaFisica.getNome());
            ps.setDate(3, PessoaFisica.getData_Nascimento());
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Seq_PessoaFisica = rs.getLong("Seq_PessoaFisica");
            }

            rs.close();
            ps.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }

    @Override
    public boolean update(Long CPF, PessoaFisica PessoaFisica) throws PersistenceException {
        try {
           Connection connection = JDBCConnectionManager.getInstance().getConnection();
            
            String SQL = "UPDATE PessoaFisica SET Nome = ?, Data_Nascimento = ?"
                    + "WHERE CPF = ?";
            
            PreparedStatement ps = connection.prepareStatement(SQL);
            
            ps.setString(1, PessoaFisica.getNome());
            ps.setDate(2, PessoaFisica.getData_Nascimento());
            ps.setLong(5, CPF);
            
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
    public PessoaFisica getPessoaFisicaCod(Long CPF) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}