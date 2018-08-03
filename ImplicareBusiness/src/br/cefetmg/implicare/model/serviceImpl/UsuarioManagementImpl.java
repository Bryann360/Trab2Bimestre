/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.serviceImpl;

import br.cefetmg.implicare.dao.UsuarioDao;
import br.cefetmg.implicare.model.daoImpl.UsuarioDaoImpl;
import br.cefetmg.implicare.model.domain.Usuario;
import br.cefetmg.implicare.model.exception.BusinessException;
import br.cefetmg.implicare.model.exception.PersistenceException;
import br.cefetmg.implicare.model.service.UsuarioManagement;

/**
 *
 * @author Gabriel
 */
public class UsuarioManagementImpl implements UsuarioManagement {
    private final UsuarioDao UsuarioDao;
    
    public UsuarioManagementImpl(){
        UsuarioDao = new UsuarioDaoImpl();
    }
    
    @Override
    public void insert(Usuario Usuario) throws BusinessException, PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Long CPF_CNPJ, Usuario Usuario) throws BusinessException, PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario getUsuarioCod(Long CPF_CNPJ) throws PersistenceException {
        Usuario result = UsuarioDao.getUsuarioCod(CPF_CNPJ);
        return result;
    }
    
}
