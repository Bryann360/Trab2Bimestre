/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.service;

import br.cefetmg.implicare.model.domain.CandidatoVagaDialogo;
import br.cefetmg.implicare.model.exception.BusinessException;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.util.List;

/**
 *
 * @author Andre Matheus
 */
public interface CandidatoVagaDialogoManagement {
    public void insert(CandidatoVagaDialogo CandidatoVagaDialogo) throws BusinessException, PersistenceException;
    public List<CandidatoVagaDialogo> listAll() throws PersistenceException;
}
