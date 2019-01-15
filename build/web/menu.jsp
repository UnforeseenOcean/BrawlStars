<%-- 
    Document   : menu
    Created on : 14 janv. 2019, 10:50:01
    Author     : lucie
--%>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="../">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Features</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Pricing</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="actionServlet?action=inscription">Inscription</a>
      </li>
    </ul>
     <div class="form-inline my-2 my-lg-0">
         <% if(request.getSession().getAttribute("connect") == null || !(Boolean)request.getSession().getAttribute("connect")) { %>
          <a class="nav-link" href="actionServlet?action=connection"><button class="btn btn-danger my-2 my-sm-0">Connexion</button></a>
          <% }else { %>
          <a class="nav-link" href="actionServlet?action=disconnection"><button class="btn btn-danger my-2 my-sm-0">Deconnexion</button></a>
          <% }%>
     </div>
  </div>
</nav>
