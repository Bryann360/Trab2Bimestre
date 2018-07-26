/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.daoImpl;

import br.cefetmg.implicare.dao.AreaEstudoDao;
import br.cefetmg.implicare.model.domain.AreaEstudo;
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
public class AreaEstudoDaoImpl implements AreaEstudoDao {

    @Override
    public List<AreaEstudo> listAll() throws PersistenceException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/comprasevendas", "postgres", "123");

            String sql = "SELECT * FROM AreaEstudo ORDER BY Nom_Area_Estudo;";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            List<AreaEstudo> listAll = new ArrayList<>();
            
            if (rs.next()) {
                do {
                    AreaEstudo Area = new AreaEstudo();
                    Area.setCod_Area_Estudo(rs.getInt("Cod_Area_Estudo"));
                    Area.setNom_Area_Estudo(rs.getString("Nom_Area_Estudo"));
                    listAll.add(Area);
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
    public AreaEstudo getAreaEstudoCod(int Cod_Area_Estudo) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
