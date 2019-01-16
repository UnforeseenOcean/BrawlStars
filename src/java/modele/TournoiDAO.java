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
import metier.domaine.Tournoi;

/**
 *
 * @author lucie
 */
public class TournoiDAO extends Modele{
    private Tournoi tournoi = null;
    public TournoiDAO(){
        super();
    }
    
    public ArrayList getTournoi(){
        try {
            ArrayList t = new ArrayList();
            rs=stmt.executeQuery("select * from tournoi"); 
            while(rs.next()){
                ArrayList tu = new ArrayList();
                tournoi = new Tournoi();
                tournoi.setDate(rs.getDate("date"));
                tournoi.setNom(rs.getString("nom"));
                tournoi.setId(rs.getInt("id"));
                tu.add(tournoi);
                TournoiDAO tournoiDAO = new TournoiDAO();
                tu.add(tournoiDAO.getParticipant(tournoi.getId()));
                t.add(tu);
            }
            return t;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public ArrayList getParticipant(int id){
        UserDAO userDAO = new UserDAO();
        ArrayList t = new ArrayList();
        try {
                rs=stmt.executeQuery("select * from user_tournoi where id_tournoi ="+id); 
                while(rs.next()){
                    t.add(userDAO.getUserById(rs.getInt("id_user")));
                }
            return t;
        } catch (Exception e) {
            return null;
        }
    }
    
    public int getLastTournoiId(){
        try {
            rs=stmt.executeQuery("SELECT * FROM tournoi WHERE id=(SELECT MAX(id) FROM tournoi)"); 
            while(rs.next()){
                return rs.getInt("id");
            }
        } catch (Exception e) { }
        return -1;
    }
    
    public boolean newTournoi(Tournoi t, ArrayList<Integer> m){
        try {
            stmt.executeUpdate("INSERT INTO tournoi (nom, date) VALUES ('"+t.getNom()+"', '"+t.getDate()+"')"); 
            int idTournoi = this.getLastTournoiId();
            for(int id : m){
                stmt.executeUpdate("INSERT INTO user_tournoi (id_user, id_tournoi) VALUES ('"+id+"', '"+idTournoi+"')"); 
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
