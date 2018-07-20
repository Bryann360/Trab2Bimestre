/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.dao;

import br.cefetmg.implicare.model.domain.Cargo;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface CargoDao {
    public List<Cargo> listAll() throws PersistenceException;
    public Cargo getCargoCod(int Cod_Cargo) throws PersistenceException;
}
