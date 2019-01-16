/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.actions;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import modele.TournoiDAO;

/**
 *
 * @author lucie
 */
public class ListeTournoiAction extends Action {
    private TournoiDAO tournoiDAO = new TournoiDAO();
    
    public String execute(HttpServletRequest request){
        ArrayList m = new ArrayList();
        m = tournoiDAO.getTournoi();
        request.setAttribute("tournoiListe", m);
        return "tournoi.jsp";
    }
}
