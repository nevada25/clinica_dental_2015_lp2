<%@include file="cabeza.jsp" %>
<style>
div.contenedor{
	padding:0;
	margin:0;
}
</style>
<div id="contenedor">
    <div id="myCarousel" class="carousel slide">
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
       
      </ol>
      <!-- Carousel items -->
      <div class="carousel-inner">
        <div class="active item"><img  src="img/img1.jpg" alt="banner1" /></div>
        <div class="item"><center><img  src="img/img2.jpg" alt="banner2" /></center></div>
       
      </div>
      <!-- Carousel nav -->
      <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
      <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
    </div>
</div>
<script>
    $(document).ready(function(){
        $('.myCarousel').carousel({
            interval: 3000
        });
    });
</script>
<%@include file="pie.jsp" %>
