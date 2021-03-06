<%-- 
    Document   : menu
    Created on : 14 janv. 2019, 10:50:01
    Author     : lucie
--%>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  
  <img style=" width: 3%;" src="/assets/images/Logo.png" alt="Brawl Stars">

  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="../">Accueil </a>
      </li>
      <% if(request.getSession().getAttribute("connect") == null || !(Boolean)request.getSession().getAttribute("connect")) { %>
      <li class="nav-item">
        <a class="nav-link" href="actionServlet?action=inscription">Inscription</a>
      </li>
      <% }else { %>
      <li class="nav-item">
        <a class="nav-link" href="actionServlet?action=tournoi">Tournoi</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="actionServlet?action=newTournoi">Nouveau tournoi</a>
      </li>
      <% }%>
    </ul>
  </div>
  <div class="form-inline my-2 my-lg-0">
         <% if(request.getSession().getAttribute("connect") == null || !(Boolean)request.getSession().getAttribute("connect")) { %>
          <a class="nav-link" href="actionServlet?action=connection"><button class="btn btn-danger my-2 my-sm-0">Connexion</button></a>
          <% }else { %>
          <a class="nav-link" href="actionServlet?action=disconnection"><button class="btn btn-danger my-2 my-sm-0">Deconnexion</button></a>
          <% }%>
     </div>
</nav>
