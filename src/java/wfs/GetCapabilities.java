/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wfs;

import exception.ExceptionClass;
import exception.WFSException;
import request.GetCapabilitiesRequest;

/**
 *
 * @author Umberto
 */
public class GetCapabilities {

    /**
     *
     * @param request
     * @throws ExceptionClass
     */
    public GetCapabilities(GetCapabilitiesRequest request) throws WFSException {
        if (request.getRequest()==null || request.getService()==null || request.getVersion()==null)
            throw new WFSException(this,"Errore non sono stati definiti uno o più dei parametri mandatory", null, "MissingParameterValue");
        
    }
    
    
    
}
