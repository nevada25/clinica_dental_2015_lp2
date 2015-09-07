
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>PERU_JAPO</title>
    <link rel="shortcut icon"  href="img/logo.ico" />
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="estilos/miestilo3.css">
    </head>
<body>
    <center>
	<section>
		<div class="cuerpo">
                    <form action="inicio.jsp">
        <div class="panel panel-default">
  <div class="panel-heading"><b><h2>INGRESE USUARIO</h2></b></div>
  <div class="panel-body">
    <form>
  <div class="form-group">
    <label for="exampleInputEmail1">USUARIO</label>
    <input type="user" class="form-control" id="exampleInputEmail1" placeholder="INGRESE USUARIO" required class>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">CONTRASE&Ntilde;A</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="INGRESE CONTRASE&Ntilde;A" required class>
  </div>
       <button  type="submit" class="btn btn-default">ACEPTAR <img  src="img/ok.png" alt=""></button>
  
  <button type="submit" class="btn btn-default" data-toggle="modal" data-target="#registro">REGISTRAR <img  src="img/user.png" alt=""></button>
    </form>
<!-- Modal -->
<div class="modal fade" id="registro" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">REGISTRAR NUEVO USUARIO</h4>
      </div>
      <div class="modal-body">
      <form>
          <div class="form-group">
    <label for="exampleInputEmail1">USUARIO:</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="INGRESE DNI">
  </div>
          <div class="form-group">
              <label for="exampleInputEmail1">CONTRASE&Ntilde;A:</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="INGRESE DNI">
  </div>
          <div class="form-group">
    <label for="exampleInputEmail1">CORREO ELECTRONICO:</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="INGRESE DNI">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">DNI:</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="INGRESE DNI">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">NOMBRE:</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="INGRESE NOMBRE">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">APELLIDO PATERNO:</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="INGRESE APELLIDO">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">APELLIDO MATERNO:</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="INGRESE APELLIDO">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">TELEFONO:</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TELEFONO">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">FECHA DE NACIMIENTO: </label>
    <input type="date">
  </div>
 
  </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">CANCELAR</button>
        <button type="button" class="btn btn-primary">CREAR</button>
      </div>
    </div>
  </div>
</div>
</center>
</div>
</form>
  </div>
</div>
        
        </div>
	</section>
</center>
	


	<script src="jquery/jquery-2.1.4.min.js">
	</script>
	<script src="bootstrap/js/bootstrap.min.js">
	</script>
</body>
</html>
