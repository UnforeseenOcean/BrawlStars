/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucie
 */
public abstract class Modele {
    protected ResultSet rs;
    protected Connection cnx;
    protected Statement stmt;
    
    public Modele(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
             cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/brawl_stars", "root", "");
            stmt=cnx.createStatement();
            
        } catch (Exception e) {
            Logger.getLogger(Modele.class.getName()).log(Level.SEVERE, null, e);
        }
          
        
    }
}
