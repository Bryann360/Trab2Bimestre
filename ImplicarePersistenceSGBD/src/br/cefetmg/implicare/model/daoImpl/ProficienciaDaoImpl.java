/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.daoImpl;

import br.cefetmg.implicare.dao.ProficienciaDao;
import br.cefetmg.implicare.model.domain.Proficiencia;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class ProficienciaDaoImpl implements ProficienciaDao {

    @Override
    public List<Proficiencia> listAll() throws PersistenceException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/comprasevendas", "postgres", "123");

            String sql = "SELECT * FROM Proficiencia ORDER BY Nivel_Proficiencia;";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            List<Proficiencia> listAll = new ArrayList<>();
            
            if (rs.next()) {
                do {
                    Proficiencia Prof = new Proficiencia();
                    Prof.setCod_Proficiencia(rs.getInt("Cod_Proficiencia"));
                    Prof.setNivel_Proficiencia(rs.getString("Nivel_Proficiencia"));
                    listAll.add(Prof);
                } while (rs.next());
            }

            rs.close();
            pstmt.close();
            connection.close();

            return listAll;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

    @Override
    public Proficiencia getLojaByCod(int Cod_Proficiencia) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
