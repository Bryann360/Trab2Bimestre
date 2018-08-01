/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.service;

import br.cefetmg.implicare.model.domain.FormacaoAcademica;
import br.cefetmg.implicare.model.exception.BusinessException;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.util.List;

/**
 *
 * @author Andre Matheus
 */
public interface FormacaoAcademicaManagement {
    public void insert(FormacaoAcademica FormacaoAcademica) throws BusinessException, PersistenceException;
    public boolean update(long CPF, int Seq_Formacao,FormacaoAcademica FormacaoAcademica) throws BusinessException, PersistenceException;
    public List<FormacaoAcademica> getFormacaoAcademica(long CPF) throws PersistenceException;
}