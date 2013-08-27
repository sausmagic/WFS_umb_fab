/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Umberto
 */
public class ExceptionClass extends RuntimeException{

    public static final String NEW_LINE = System.getProperty("line.separator");
    
    public static final String MISSING_PARAMETER_VALUE = "MissingParameterValue";
    public static final String INVALID_PARAMETER_VALUE = "InvalidParameterValue";
    public static final String NO_APPLICABLE_CODE = "NoApplicableCode";
    public static final String UNSUPPORTED_COMBINATION = "UnsupportedCombination";
    public static final String NOT_ENOUGH_STORAGE = "NotEnoughStorage";
    public static final String INVALID_UPDATE_SEQUENCE = "InvalidUpdateSequence";
    public static final String CURRENT_UPDATE_SEQUENCE = "CurrentUpdateSequence";
    public static final String VERSION_NEGOTIATION_FAILED = "VersionNegotiationFailed";
    
    protected String locator;
    protected String code;
     /**
     * List of text recording information about the exception
     */
    List exceptionText = new ArrayList();
    
    public ExceptionClass() {
    }

    public ExceptionClass(String message) {
        super(message);
    }

    public ExceptionClass(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionClass(Throwable cause) {
        super(cause);
    }

    public ExceptionClass(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    /**
     * 
     * @param message messaggio di errore 
     * @param cause causa dell'eccezione 
     * @param locator dove è avvenuto l'errore
     * @param code codice errore verificatosi
     */
    public ExceptionClass(String message, Throwable cause, String locator,String code) {
        this(message, cause, code);
        this.locator=locator;
    }
    public ExceptionClass(String message, Throwable cause,String code) {
        this(message, cause);
        this.code=code;
    }

    public String getLocator() {
        return locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
     /**
     * Chaining method for setting locator.
     * <p>
     * This allows code to:
     * <code><pre>
     * throw new ExceptionClass(...).locator("someLocator");
     * </pre></code> 
     * </p>
     */
    public ExceptionClass locator(String locator) {
        setLocator(locator);
        return this;
    }
    
     /**
     * Chaining method for setting code.
     * <p>
     * This allows code to:
     * <code><pre>
     * throw new ExceptionClass(...).code("someCode");
     * </pre></code> 
     * </p>
     */
    public ExceptionClass code(String code) {
        setCode(code);
        return this;
    }
    
    @Override
    public String toString() {
        String msg = super.toString();
        if(exceptionText == null || exceptionText.size() == 0)
            return msg;
        
        StringBuffer sb = new StringBuffer(msg);
        for (Iterator it = exceptionText.iterator(); it.hasNext();) {
            String extraMessage = (String) it.next();
            sb.append(NEW_LINE).append(extraMessage);
        }
        return sb.toString();
    }
    
    /**
     * Returns the list of text fragments which provide additonal information
     * about the exception.
     * <p>
     * Text fragements may be added directly to the list with:
     * <code>
     * exception.getExceptionTest().add( "text fragment" );
     * </code>
     * </p>
     * @return A list of String recording information about the exception.
     */
    public List getExceptionText() {
        return exceptionText;
    }

    

   
    
    
}
