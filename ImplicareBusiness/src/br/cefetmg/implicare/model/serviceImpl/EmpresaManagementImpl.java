/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.serviceImpl;

import br.cefetmg.implicare.dao.EmpresaDao;
import br.cefetmg.implicare.model.daoImpl.EmpresaDaoImpl;
import br.cefetmg.implicare.model.domain.Empresa;
import br.cefetmg.implicare.model.exception.BusinessException;
import br.cefetmg.implicare.model.exception.PersistenceException;
import br.cefetmg.implicare.model.service.EmpresaManagement;

/**
 *
 * @author Gabriel
 */
public class EmpresaManagementImpl implements EmpresaManagement {
    private final EmpresaDao EmpresaDao;
    
    public EmpresaManagementImpl(){
        EmpresaDao = new EmpresaDaoImpl(); 
    }
    
    @Override
    public void insert(Empresa Empresa) throws BusinessException, PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Long CNPJ, Empresa Empresa) throws BusinessException, PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empresa getEmpresaCod(Long CNPJ) throws PersistenceException {
        Empresa result = EmpresaDao.getEmpresaCod(CNPJ);
        return result;
    }
    
}
