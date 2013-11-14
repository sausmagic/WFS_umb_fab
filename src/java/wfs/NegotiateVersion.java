/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wfs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Umberto
 */
public class NegotiateVersion {

    private static String VS_10 = "1.0.0";
    private static String VS_11 = "1.1.0";
    private static String VS_20 = "2.0.0";

    /**
     * Metodo che ritorna true se la versione è supportata e false viceversa
     * @param version
     * @return 
     */
    public static boolean acceptedVersion(String version) {

        // if(version.isEmpty())
        //  getSupportedVersion();
        System.out.println("il parametro versione è: " + version);
        System.out.println("il parametro VS_11 è: " + VS_11);

        if (version.startsWith("\"") & version.endsWith("\"")) {
            version = version.substring(1, version.length() - 1);
        }

        System.out.println("il parametro versione è: " + version);
        if (version.equalsIgnoreCase(VS_11)) {
            return true;
        } else if (version.equalsIgnoreCase(VS_20)) {
            return false;
        }
        else if (version.equalsIgnoreCase(VS_10)) {
            return false;
        }
        return false;
    }

    /**
     * public static String getSupportedVersion(){ return VS_11;
    }*
     */
    /**
     * attualmente ritorna che supporta tutte e tre le versioni è solo una prova 
     * supporta solo la versione WFS 1.1 in quanto solo questa specifica sto lavorando
     * @return 
     */
    public static List<String> getSupportedVersion() {
        List<String> supportedversionList = new ArrayList<String>();
        supportedversionList.add(VS_10);
        supportedversionList.add(VS_20);
        return supportedversionList;
    }

    public static String getVersion20() {
        return VS_20;
    }
    
    public static String getVersion11() {
        return VS_11;
    }
}
