/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.domaine.User;

/**
 *
 * @author lucie
 */
public class UserDAO extends Modele{
    private User user = null;
    private ArrayList t = new ArrayList();
    public UserDAO(){
        super();
    }
    
    public User getUser(User u){
        try {
            rs=stmt.executeQuery("select * from user where email ='"+u.getEmail()+"' and password='"+u.getPassword()+"'"); 
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
    
    public User getUserById(int id){
        try {
            rs=stmt.executeQuery("select * from user where id ="+id); 
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
    
    public ArrayList getUsers(){
        try {
            rs=stmt.executeQuery("select * from user"); 
            while(rs.next()){
                user = new User();
                user.setEmail(rs.getString("email"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setId(rs.getInt("id"));
                t.add(user);
            }
            return t;
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean newUser(User u){
        try {
            stmt.executeUpdate("INSERT INTO user (username, email, password) VALUES ('"+u.getUsername()+"', '"+u.getEmail()+"', '"+u.getPassword()+"')"); 
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
