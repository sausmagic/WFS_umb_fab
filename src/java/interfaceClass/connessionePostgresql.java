package interfaceClass;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;

/**
 *
 * @author Umberto
 */
public interface connessionePostgresql {
    
    public Connection startConnessioneDB();
    public void closeConnection();
}
