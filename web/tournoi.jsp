<%-- 
    Document   : tournoi
    Created on : 16 janv. 2019, 20:37:05
    Author     : lucie
--%>

<%@page import="metier.domaine.User"%>
<%@page import="metier.domaine.Tournoi"%>
<%@page import="java.util.ArrayList"%>
<%@include file="header.jsp" %>
<%@include file="menu.jsp" %>
<div class="container">
    <h1>Liste des tournois</h1>
    <% 
        ArrayList<ArrayList> tournois = (ArrayList)request.getAttribute("tournoiListe");
        if(tournois != null){
        for(ArrayList t : tournois){
            Tournoi tournoi = (Tournoi)t.get(0);
            ArrayList<User> users = (ArrayList)t.get(1);
    %>
    <div class="jumbotron">
        <h1 class="display-3"><%= tournoi.getNom() %></h1>
        <p class="lead">Ce tournoi aura lieu le : <%= tournoi.getDate() %></p>
        <hr class="my-4">
        <p>Participants</p>
        <hr class="my-4">
        <%
            if(users != null){
            for(User u : users){
       %>
       <p><%= u.getUsername() %></p>
       <% }} %>
      </div>
    
    <% }} %>
</div>
</body>
</html>
