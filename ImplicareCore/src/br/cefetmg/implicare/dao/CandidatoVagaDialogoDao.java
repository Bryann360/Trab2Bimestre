/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.dao;

import br.cefetmg.implicare.model.domain.CandidatoVagaDialogo;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface CandidatoVagaDialogoDao {
    
    public void insert(CandidatoVagaDialogo CandidatoVagaDialogo) throws PersistenceException;
    public List<CandidatoVagaDialogo> listAll() throws PersistenceException;
    //public Loja getLojaByCod(Long Cod_Loja) throws PersistenceException;
    
}
