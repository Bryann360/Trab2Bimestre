/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.dao;

import br.cefetmg.implicare.model.domain.Cargo;
import br.cefetmg.implicare.model.domain.CargoAreaEstudo;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Gabriel
 */
public interface CargoDao {
    public List<Cargo> listAll() throws PersistenceException;
    public List<Cargo> getCargos(Set<CargoAreaEstudo> CargoArea) throws PersistenceException;
    public Cargo getCargoCod(int Cod_Cargo) throws PersistenceException;
}
