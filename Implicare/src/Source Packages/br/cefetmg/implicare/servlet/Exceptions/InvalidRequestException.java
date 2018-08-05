/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.servlet.Exceptions;

import javax.servlet.ServletException;

/**
 *
 * @author João Victor
 */
public class InvalidRequestException extends ServletException {
    
    public InvalidRequestException()
    {
        super("A invalid request was made");
    }
    
    public InvalidRequestException(String msg)
    {
        super(msg);
    }
}
