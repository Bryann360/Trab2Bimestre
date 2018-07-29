/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.service;

import br.cefetmg.implicare.model.domain.CargoAreaEstudo;
import br.cefetmg.implicare.model.exception.BusinessException;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.util.List;

/**
 *
 * @author Andre Matheus
 */
public interface CargoAreaEstudoManagement {
    public void insert(CargoAreaEstudo CargoAreaEstudo) throws BusinessException, PersistenceException;
    public boolean delete(int Cod_Area_Estudo, int Cod_Cargo) throws PersistenceException;
    public List<CargoAreaEstudo> listAll() throws PersistenceException;
}
