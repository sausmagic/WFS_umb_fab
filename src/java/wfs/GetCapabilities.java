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
     *Questa classe riceve la richiesta, la elabora e procede 
     * a richiamare laclasse per creare la risposta da inviare al client
     * @param request richietsa elaborata dal server ricevuta in precedenza dal client.
     * 
     */
    public GetCapabilities(GetCapabilitiesRequest request){
        System.out.println("mi trovo nella classe "+this.getClass().getName());
        System.out.println("la versione richiesta è: "+request.getVersion());
        System.out.println("La section contiene+ "+request.getSections().get(0));
    }
    
    
    
}
