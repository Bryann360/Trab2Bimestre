/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.serviceImpl;

import br.cefetmg.implicare.model.domain.CandidatoVaga;
import br.cefetmg.implicare.model.exception.BusinessException;
import br.cefetmg.implicare.model.exception.PersistenceException;
import br.cefetmg.implicare.model.service.CandidatoVagaManagement;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class CandidatoVagaManagementImpl implements CandidatoVagaManagement {

    @Override
    public void insert(CandidatoVaga CandidatoVaga) throws BusinessException, PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(long CPF, int Cod_Cargo, long CNPJ, Date Dat_Publicacao, CandidatoVaga CandidatoVaga) throws BusinessException, PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CandidatoVaga> getCandidatosVaga(int Cod_Cargo, long CNPJ, Date Dat_Publicacao) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
