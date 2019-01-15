/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.actions;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author lucie
 */
public abstract class Action {
    public String execute(HttpServletRequest request){return "index.jps"; }
}
