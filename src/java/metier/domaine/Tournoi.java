/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.domaine;

import java.sql.Date;

/**
 *
 * @author lucie
 */
public class Tournoi {
    private int id;
    private String nom;
    private Date date;

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom.toLowerCase();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return Character.toUpperCase(nom.charAt(0)) + nom.substring(1);
    }

    public Date getDate() {
        return date;
    }
    
}
