/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.serviceImpl;

import br.cefetmg.implicare.dao.TelefoneDao;
import br.cefetmg.implicare.model.daoImpl.TelefoneDaoImpl;
import br.cefetmg.implicare.model.domain.Telefone;
import br.cefetmg.implicare.model.exception.BusinessException;
import br.cefetmg.implicare.model.exception.PersistenceException;
import br.cefetmg.implicare.model.service.TelefoneManagement;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class TelefoneManagementImpl implements TelefoneManagement {
    private final TelefoneDao TelefoneDao;
    
    public TelefoneManagementImpl(){
        TelefoneDao = new TelefoneDaoImpl();
    }
    
    @Override
    public void insert(Telefone Telefone) throws BusinessException, PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(long CPF_CNPJ, String Num_Telefone, Telefone Telefone) throws BusinessException, PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(long CPF_CNPJ, String Num_Telefone) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Telefone> getTelefone(long CPF_CNPJ) throws PersistenceException {
        List<Telefone> result = TelefoneDao.getTelefone(CPF_CNPJ);
        return result;
    }
    
}
