/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.daoImpl;

import br.cefetmg.implicare.dao.UsuarioDao;
import br.cefetmg.implicare.model.domain.Usuario;
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
public class UsuarioDaoImpl implements UsuarioDao{

    @Override
    public void insert(Usuario Usuario) throws PersistenceException {
        try {
            if (Usuario == null) {
                throw new PersistenceException("Entidade não pode ser nula.");
            }
            Long Seq_Usuario;
                    
            Connection connection = JDBCConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO Usuario (CPF_CNPJ, Email, Senha, Foto,"
                    + "Cod_Cep, Endereco, Desc_Usuario) "
                    + "VALUES(?,?,?,?,?,?,?) RETURNING Seq_Usuario";

            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setLong(1, Usuario.getCPF_CNPJ());
            ps.setString(2, Usuario.getEmail());
            ps.setString(3, Usuario.getSenha());
            //ps.setURL(4, Usuario.getFoto());
            ps.setLong(5, Usuario.getCod_CEP());
            ps.setString(6, Usuario.getEndereco());
            ps.setString(7, Usuario.getDesc_Usuario());
            
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Seq_Usuario = rs.getLong("Seq_Usuario");
            }

            rs.close();
            ps.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }

    @Override
    public boolean update(Long CPF_CNPJ, Usuario Usuario) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario getUsuarioCod(Long CPF_CNPJ) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
