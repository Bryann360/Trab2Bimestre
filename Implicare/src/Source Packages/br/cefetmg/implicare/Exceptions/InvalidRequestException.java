package br.cefetmg.implicare.Exceptions;

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
