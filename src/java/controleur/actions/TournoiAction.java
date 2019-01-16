/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.actions;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import metier.domaine.Tournoi;
import modele.TournoiDAO;
import modele.UserDAO;

/**
 *
 * @author lucie
 */
public class TournoiAction extends Action{
    private TournoiDAO tournoiDAO = new TournoiDAO();
    private UserDAO userDAO = new UserDAO();
    private Tournoi tournoi = new Tournoi();
    private boolean result = false;
    
    public String execute(HttpServletRequest request){
        String[] membre = request.getParameterValues("membre");
        ArrayList m = new ArrayList();
        String nom = request.getParameter("nom");
        String dateStr = request.getParameter("date");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            if(dateStr != null){
                date = new Date(sdf.parse(dateStr).getTime());
            }
        } catch (ParseException ex) {
            Logger.getLogger(TournoiAction.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        if(nom != null && date != null &&  !nom.equals("")  && !date.equals("")){
            tournoi.setDate(date);
            tournoi.setNom(nom);
            if(membre != null){
              for(String s : membre){
                  m.add(Integer.parseInt(s));
              }
          }
            result = tournoiDAO.newTournoi(tournoi, m);
            if(result){
                 request.setAttribute("tournoi", true);
            }
        }
        request.setAttribute("users", userDAO.getUsers());
        return "tournoiN.jsp";
    }
}
