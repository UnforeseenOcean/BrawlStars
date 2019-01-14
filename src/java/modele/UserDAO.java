/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.domaine.User;

/**
 *
 * @author lucie
 */
public class UserDAO extends Modele{
    private User user = null;
    public UserDAO(){
        super();
    }
    
    public User getUser(String email, String password){
        try {
            rs=stmt.executeQuery("select * from user where email ='"+email+"' and password='"+password+"'"); 
            while(rs.next()){
                user = new User();
                user.setEmail(rs.getString("email"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setId(rs.getInt("id"));
            }
            return user;
        } catch (Exception e) {
            return null;
        }
    }
}
