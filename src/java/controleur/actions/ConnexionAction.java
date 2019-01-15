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
public class ConnexionAction extends Action{
    private UserDAO userDAO = new UserDAO();
    private User user;
    
    public String execute(HttpServletRequest request){
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        user = userDAO.getUser(email, password);
        if(user != null){
            request.getSession().setAttribute("connect",  true);
            return "index.jsp";
        } else {
            return "connection.jsp";
        }
        
    }
}
