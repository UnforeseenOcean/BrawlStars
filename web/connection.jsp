<%-- 
    Document   : connection
    Created on : 14 janv. 2019, 11:53:48
    Author     : lucie
--%>

<%@include file="header.jsp" %>
<%@include file="menu.jsp" %>
<h1>Se connecter</h1>
<div class="container">
    <form class="form-horizontal" action="actionServlet" method="post">
        <div class="form-group">
          <label for="exampleInputEmail1">Email</label>
          <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Email">
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">Mot de passe</label>
          <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Mot de passe">
        </div>
        <input type="hidden" name="action" value="connection">
        <button type="submit" class="btn btn-primary">Se connecter</button>
    </form>
</div>
    </body>
</html>
