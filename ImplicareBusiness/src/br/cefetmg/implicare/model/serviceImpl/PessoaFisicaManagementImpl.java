/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.serviceImpl;

import br.cefetmg.implicare.dao.PessoaFisicaDao;
import br.cefetmg.implicare.model.daoImpl.PessoaFisicaDaoImpl;
import br.cefetmg.implicare.model.domain.PessoaFisica;
import br.cefetmg.implicare.model.exception.BusinessException;
import br.cefetmg.implicare.model.exception.PersistenceException;
import br.cefetmg.implicare.model.service.PessoaFisicaManagement;

/**
 *
 * @author Gabriel
 */
public class PessoaFisicaManagementImpl implements PessoaFisicaManagement {
    private final PessoaFisicaDao PessoaFisicaDao;
    
    public PessoaFisicaManagementImpl(){
        PessoaFisicaDao = new PessoaFisicaDaoImpl(); 
    }
    
    @Override
    public void insert(PessoaFisica PessoaFisica) throws BusinessException, PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Long CPF, PessoaFisica PessoaFisica) throws BusinessException, PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PessoaFisica getPessoaFisicaCod(Long CPF) throws PersistenceException {
        PessoaFisica result = PessoaFisicaDao.getPessoaFisicaCod(CPF);
        return result;
    }
    
}
