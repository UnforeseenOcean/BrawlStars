<%-- 
    Document   : connection
    Created on : 14 janv. 2019, 11:53:48
    Author     : lucie
--%>

<%@include file="header.jsp" %>
<%@include file="menu.jsp" %>
<h1>S'inscrire</h1>
<div class="container">
    <% if( request.getAttribute("inscription") != null && (Boolean)request.getAttribute("inscription") ){ %>
    <div class="alert alert-dismissible alert-success">
        <button class="close" type="button" data-dismiss="alert">&times;</button>
        <strong>Bien joué!</strong> Tu t'es inscript <a class="alert-link" href="#">petit cochon.</a>.
      </div>
    <% } %>
    <form class="form-horizontal" action="actionServlet" method="post">
        <div class="form-group">
          <label for="username">Username</label>
          <input type="text" name="username" class="form-control" id="username" placeholder="Username">
        </div>
        <div class="form-group">
          <label for="exampleInputEmail1">Email</label>
          <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Email">
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">Mot de passe</label>
          <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Mot de passe">
        </div>
        <input type="hidden" name="action" value="inscription">
        <button type="submit" class="btn btn-primary">S'inscrire</button>
    </form>
</div>
    </body>
</html>
