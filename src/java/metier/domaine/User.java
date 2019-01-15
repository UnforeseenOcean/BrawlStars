/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.domaine;

/**
 *
 * @author lucie
 */
public class User {
    private String username;
    private String email;
    private String password;
    private int id;

    public void setUsername(String username) {
        this.username = username.toLowerCase();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = this.encrypt(password);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return Character.toUpperCase(username.charAt(0)) + username.substring(1);
    }
    
     private String encrypt(String password){
        String crypte= "";
        for (int i=0; i<password.length();i++)  {
            int c=password.charAt(i)^48;  
            crypte=crypte+(char)c; 
        }
        return crypte;
    }
     
     private String decrypt(String password){
        String aCrypter= "";
        for (int i=0; i<password.length();i++)  {
            int c=password.charAt(i)^48;  
            aCrypter=aCrypter+(char)c; 
        }
        return aCrypter;
    }
}
