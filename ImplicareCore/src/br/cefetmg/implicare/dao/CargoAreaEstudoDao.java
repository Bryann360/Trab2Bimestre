/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.dao;


import br.cefetmg.implicare.model.domain.CargoAreaEstudo;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface CargoAreaEstudoDao {
    public void insert(CargoAreaEstudo CargoAreaEstudo) throws PersistenceException;
    public boolean delete(int Cod_Area_Estudo, int Cod_Cargo) throws PersistenceException;
    public List<CargoAreaEstudo> listAll() throws PersistenceException;
 
}
