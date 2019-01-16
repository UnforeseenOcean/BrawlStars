/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;


import controleur.actions.Action;
import controleur.actions.ConnexionAction;
import controleur.actions.InscriptionAction;
import controleur.actions.ListeTournoiAction;
import controleur.actions.TournoiAction;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lucie
 */
public class ActionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
                String action = request.getParameter("action");
                RequestDispatcher rd;
                Action a = null;
                String vue = "index.jsp";
                if(action != null) {
                    switch(action){
                        case "connection" : 
                            a = new ConnexionAction();
                            vue = a.execute(request);
                            rd = request.getRequestDispatcher(vue);
                            break;
                        case "disconnection" : 
                            request.getSession().setAttribute("connect",  false);
                            rd = request.getRequestDispatcher(vue);
                            break;
                        case "inscription" : 
                            a = new InscriptionAction();
                            vue = a.execute(request);
                            rd = request.getRequestDispatcher(vue);
                            break;
                        case "newTournoi" : 
                            a = new TournoiAction();
                            vue = a.execute(request);
                            rd = request.getRequestDispatcher(vue);
                            break;
                        case "tournoi" : 
                            a = new ListeTournoiAction();
                            vue = a.execute(request);
                            rd = request.getRequestDispatcher(vue);
                            break;
                        default :
                            rd = request.getRequestDispatcher(vue);
                    }              
                } else {
                     rd = request.getRequestDispatcher(vue);
                }
                
                rd.forward(request, response);
                
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
