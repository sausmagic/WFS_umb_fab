/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import servlet.RequestResponse;
import wfs.NegotiateVersion;

/**
 *
 * @author Umberto
 */
public class WFSException extends ExceptionClass{
    public enum Code {
        OperationProcessingFailed
    };

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
     * Sono da rivedere alcune cose sulle eccezioni
     * @param request 
     */
    private WFSException init(Object request) {
        System.out.println("Mi trovo nella classe delle eccezzioni l'oggetto in input a questo metodo INIT");
        if(request != null){
            System.out.println("Il parametro request non è null");
            
        }
        if(request instanceof HttpServletRequest){
            locator = ((HttpServletRequest)request).getClass().getName();
            return this;
        }
        if(request instanceof RequestResponse){
            //estraggo i parametri della richiesta
            System.out.println("Sono in WFSException e la request è di tipo REQUESTRESPONSE");
            Map<String,String[]> parametriRichiesta;
            parametriRichiesta = ((RequestResponse)request).getRequest().getParameterMap();
            if (parametriRichiesta.get("request")== null){
                code = ExceptionClass.MISSING_PARAMETER_VALUE;
                locator="request";
            }else if(parametriRichiesta.get("service")== null){
                code = ExceptionClass.MISSING_PARAMETER_VALUE;
                locator="service";
            }
            else if(parametriRichiesta.get("version")[0] != "1.1.0" || parametriRichiesta.get("version")[0] != "1.0.0"){
                code = "UnsupportedVersionFromServer";
                locator="version";
            }
            return this;
        }
        if(request instanceof String){
            if(((String)request).equalsIgnoreCase("UnsupportedVersionFromServer")){
                code = "UnsupportedVersionFromServer";
                locator="version";
            }
            return this;
        }
        if(request instanceof Throwable){
            System.out.println("il parametro request è: "+ (String)request);
            locator= ((Throwable)request).getClass().getName();
            code = (String)request;
            return this;
        }
        return this;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
