/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import interfaceClass.connessionePostgresql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Umberto
 */
public class operazioniDB implements connessionePostgresql {

    private static Connection connection = null;

  
    @Override
    public Connection startConnessioneDB() {
        // Creiamo la connessione

        try {
            // Definiamo il tipo di driver da utilizzare
            //(in questo caso PostgreSQL)
            Class.forName("org.postgresql.Driver");
            // Settiamo la connessione specificando
            // hostname: il server che ospita il database
            // port: la porta di connessione
            // dbname: il nome del database che utilizziamo
            // username e password: le credenziale di accesso al database
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Umberto",
                    "postgres", "sausmagic");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(operazioniDB.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(operazioniDB.class.getName()).log(Level.ALL, "Connessione avvenuta con successo");
            System.err.println("Connessione....ok");

        } catch (SQLException ex) {
            Logger.getLogger(operazioniDB.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(operazioniDB.class.getName()).log(Level.ALL, "Connessione avvenuta con successo");
            System.err.println("Connessione....ok");

        }

        Logger.getLogger(operazioniDB.class.getName()).log(Level.ALL, "Connessione avvenuta con successo");
        System.err.println("Connessione....ok");
        return connection;
    }

   
    @Override
    public void closeConnection() {
        try {
            connection.close();
            System.err.println("Connessione chiusa correttamente......");
        } catch (SQLException ex) {
            Logger.getLogger(operazioniDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
