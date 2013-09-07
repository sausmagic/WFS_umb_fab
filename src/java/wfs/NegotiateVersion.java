/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wfs;

/**
 *
 * @author Umberto
 */
public class NegotiateVersion {
    
    private static String VS_10 ="1.0.0";
    private static String VS_11 ="1.1.0";
    private static String VS_20 ="2.0.0";
    
    public static boolean acceptedVersion(String version){
    
       // if(version.isEmpty())
          //  getSupportedVersion();
        System.out.println("il parametro versione è: "+version);
        System.out.println("il parametro VS_11 è: "+VS_11);
       // version = version.substring(1,version.length()-1);
        System.out.println("il parametro versione è: "+version);
        if(version.equalsIgnoreCase(VS_11)){
            return true;
        }
        return false;
    }
    
    public static String getSupportedVersion(){
        return VS_11;
    }
}
