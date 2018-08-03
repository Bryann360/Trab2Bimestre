/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.serviceImpl;

import br.cefetmg.implicare.dao.CompetenciaPessoaFisicaDao;
import br.cefetmg.implicare.model.daoImpl.CompetenciaPessoaFisicaDaoImpl;
import br.cefetmg.implicare.model.domain.CompetenciaPessoaFisica;
import br.cefetmg.implicare.model.exception.BusinessException;
import br.cefetmg.implicare.model.exception.PersistenceException;
import br.cefetmg.implicare.model.service.CompetenciaPessoaFisicaManagement;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class CompetenciaPessoaFisicaManagementImpl implements CompetenciaPessoaFisicaManagement {
    private final CompetenciaPessoaFisicaDao CompetenciaPessoaFisicaDao;
    
    public CompetenciaPessoaFisicaManagementImpl(){
        CompetenciaPessoaFisicaDao = new CompetenciaPessoaFisicaDaoImpl();
    }
    
    @Override
    public void insert(CompetenciaPessoaFisica CompetenciaPessoaFisica) throws BusinessException, PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(long CPF, int Cod_Competencia) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CompetenciaPessoaFisica> getCompetenciaPessoaFisica(long CPF) throws PersistenceException {
        List<CompetenciaPessoaFisica> result = CompetenciaPessoaFisicaDao.getCompetenciaPessoaFisica(CPF);
        return result;
    }
    
}
