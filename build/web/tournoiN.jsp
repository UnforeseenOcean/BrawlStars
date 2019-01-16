<%-- 
    Document   : tournoiN
    Created on : 16 janv. 2019, 17:56:13
    Author     : lucie
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="metier.domaine.User"%>
<%@include file="header.jsp" %>
<%@include file="menu.jsp" %>
<h1>Nouveau tournoi</h1>
<div class="container">
    <% if( request.getAttribute("tournoi") != null && (Boolean)request.getAttribute("tournoi") ){ %>
    <div class="alert alert-dismissible alert-success">
        <button class="close" type="button" data-dismiss="alert">&times;</button>
        <strong>Bien joué!</strong> Tu a bien créé un nouveau tournoi <a class="alert-link" href="#">petit cochon.</a>.
      </div>
    <% } %>
    <form class="form-horizontal" action="actionServlet" method="post">
        <div class="form-group">
          <label for="username">Nom</label>
          <input type="text" name="nom" class="form-control" id="username" placeholder="Nom">
        </div>
        <div class="form-group">
          <label for="exampleInputEmail1">Date</label>
          <input type="date" name="date" class="form-control" id="exampleInputEmail1" placeholder="Date">
        </div>
        <div class="form-group">
                <p>Participants</p>
                <% 
                    int i=0;
                    ArrayList<User> users = (ArrayList)request.getAttribute("users");
                    for(User u : users){
                %>
                <div class="custom-control custom-checkbox">
                    <input name="membre" value="<%= u.getId() %>" id="user<%= i %>" class="custom-control-input" type="checkbox" >
                    <label class="custom-control-label" for="user<%= i %>"><%= u.getUsername() %></label>
              </div>
               <% i++;} %>
        </div>
        <input type="hidden" name="action" value="newTournoi">
        <button type="submit" class="btn btn-primary">Ajouter</button>
    </form>
</div>
    </body>
</html>
