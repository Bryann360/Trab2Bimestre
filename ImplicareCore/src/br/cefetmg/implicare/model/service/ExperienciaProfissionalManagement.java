/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.service;

import br.cefetmg.implicare.model.domain.ExperienciaProfissional;
import br.cefetmg.implicare.model.exception.BusinessException;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.util.List;

/**
 *
 * @author Andre Matheus
 */
public interface ExperienciaProfissionalManagement {
    public void insert(ExperienciaProfissional ExperienciaProfissional) throws BusinessException, PersistenceException;
    public boolean update(Long CPF, int Cod_Cargo, ExperienciaProfissional ExperienciaProfssional) throws BusinessException, PersistenceException;
    public List<ExperienciaProfissional> listAll() throws PersistenceException;
}
