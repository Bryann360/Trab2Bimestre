/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.dao;

import br.cefetmg.implicare.model.domain.ExperienciaProfissional;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface ExperienciaProfissionalDao {
    public void insert(ExperienciaProfissional ExperienciaProfissional) throws PersistenceException;
    public boolean update(Long CPF, int Cod_Cargo, ExperienciaProfissional ExperienciaProfssional) throws PersistenceException;
    public List<ExperienciaProfissional> listAll() throws PersistenceException;
}