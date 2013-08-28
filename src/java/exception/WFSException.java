/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import javax.servlet.http.HttpServletRequest;
import request.GetCapabilitiesRequest;

/**
 *
 * @author Umberto
 */
public class WFSException extends ExceptionClass{

    public WFSException() {
    }
    public WFSException(Object request, String message) {
        this(message); 
        init(request);
    }

    public WFSException(String message) {
        super(message);
    }

    public WFSException(String message, Throwable cause) {
        super(message, cause);
    }

    public WFSException(Throwable cause) {
        super(cause);
    }

    public WFSException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
     public WFSException(Object request, String message, Throwable cause, String code) {
        this(message, cause, code);
        init(request);
    }

    public WFSException(Object request, String message, Throwable cause) {
        this(message, cause);
        init(request);
    }

    public WFSException(Object request, Throwable cause, String code) {
        this(cause, code);
        init(request);
    }

    /**
     * 
     * @param request 
     */
    private WFSException init(Object request) {
        System.out.println("Mi trovo nella classe delle eccezzioni l'oggetto in input a questo metodo INIT");
        if(request != null){
            System.out.println("Il parametro request non è null");
            
        }
        if(request instanceof HttpServletRequest)
            locator = ((HttpServletRequest)request).getClass().getName();
        return this;
    }
    
}
