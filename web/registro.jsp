<%@include file="cabeza.jsp" %>

<div id="cuerpo">
<center>
<!-- PACIENTE-->
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#paciente">
  PACIENTE
</button>

<!-- Modal -->
<div class="modal fade" id="paciente" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h1 class="modal-title" id="myModalLabel">REGISTRO PERSONA</h1>
      </div>
      <div class="modal-body">
        <form>
  <div class="form-group">
    <label for="exampleInputEmail1">DNI</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="INGRESE DNI">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">NOMBRE</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="INGRESE NOMBRE">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">APELLIDO PATERNO</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="INGRESE APELLIDO">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">APELLIDO MATERNO</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="INGRESE APELLIDO">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">TELEFONO</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TELEFONO">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">FECHA DE NACIMIENTO: </label>
    <input type="date">
  </div>
 
  </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>

<!--ESPECIALISTA-->
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#doctor">
  ESPECIALISTA
</button>

<!-- Modal -->
<div class="modal fade" id="doctor" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
      <form>
  <div class="form-group">
    <label for="exampleInputEmail1">DNI</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="INGRESE DNI">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">NOMBRE</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="INGRESE NOMBRE">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">APELLIDO PATERNO</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="INGRESE APELLIDO">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">APELLIDO MATERNO</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="INGRESE APELLIDO">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">TELEFONO</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="TELEFONO">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">FECHA DE NACIMIENTO: </label>
    <input type="date">
  </div>
 
  </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">CERRAR</button>
        <button type="button" class="btn btn-primary">GUARDAR</button>
      </div>
    </div>
  </div>
</div>
</center>
</div>
<%@include file="pie.jsp" %>

