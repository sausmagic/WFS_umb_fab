/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

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
    private void init(Object request) {
        if(request instanceof GetCapabilitiesRequest)
            locator = ((GetCapabilitiesRequest)request).getClass().getName();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
