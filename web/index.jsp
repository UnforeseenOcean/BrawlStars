<%-- 
    Document   : index
    Created on : 14 janv. 2019, 10:45:02
    Author     : lucie
--%>

<%@include file="header.jsp" %>
<%@include file="menu.jsp" %>
 <div class="container">
     <a href="../build/web/header.jsp"></a>
  <h2>Articles tendances</h2>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="/assets/images/daryl.jpg" alt="Daryl" style="width:100%;">
        <div class="carousel-caption">
          <h3>Darryl</h3>
          <p>Le branleur le plus claqué !</p>
        </div>
      </div>

      <div class="item">
        <img src="/assets/images/Brawl.jpg" alt="Brawl" style="width:100%;">
        <div class="carousel-caption">
          <h3>Venez nous rejoindre !</h3>
          <p>Découvrez Brawl Stars</p>
        </div>
      </div>
    
      <div class="item">
        <img src="/assets/images/penny.jpg" alt="Penny" style="width:100%;">
        <div class="carousel-caption">
          <h3>Pro tips ;)</h3>
          <p>Maitrisez ce branleur comme personne !</p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Précédent</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Suivant</span>
    </a>
  </div>
</div>
 

</body>
</html>
