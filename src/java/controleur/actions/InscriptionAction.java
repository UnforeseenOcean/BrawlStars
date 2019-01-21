/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.actions;

import javax.servlet.http.HttpServletRequest;
import metier.domaine.User;
import modele.UserDAO;

/**
 *
 * @author lucie
 */
public class InscriptionAction extends Action{
    private UserDAO userDAO = new UserDAO();
    private User user = new User();
    private boolean result = false;
    
    public String execute(HttpServletRequest request){
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String username = request.getParameter("username");
        // Vérifie les paramètres
        if(email != null && password != null && username != null && !email.equals("")  && !password.equals("") && !username.equals("") ){
            user.setEmail(email);
            user.setPassword(password);
            user.setUsername(username);
            result = userDAO.newUser(user);
            if(result){
                 request.setAttribute("inscription", true);
            }
        }
        return "inscription.jsp";
    }
}
