/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.sql.Date;

/**
 *
 * @author NEVADA
 */
public class Persona {
  private int id_persona ;
  private int id_grado_instruccion;
  private int id_ocupacion;
  private int id_ubigeo_nac ;
  private int id_ubigeo_act;
  private String nombre;
  private String nombres;
  private String apepat;
  private String apemat;
  private Date  fecha_nac;
  private String documento_identidad ;
  private String nro_doc;
  private String ruc;
  private String correo_gmail;
  private String correo_hotmail;
  private String correo_otros;
  private String celular ;
  private String telefono;
  private String sexo;
  private String direccion;
  private String pagina_web;
  private String foto_persona ;
  private String estado;

    public Persona() {
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_grado_instruccion() {
        return id_grado_instruccion;
    }

    public void setId_grado_instruccion(int id_grado_instruccion) {
        this.id_grado_instruccion = id_grado_instruccion;
    }

    public int getId_ocupacion() {
        return id_ocupacion;
    }

    public void setId_ocupacion(int id_ocupacion) {
        this.id_ocupacion = id_ocupacion;
    }

    public int getId_ubigeo_nac() {
        return id_ubigeo_nac;
    }

    public void setId_ubigeo_nac(int id_ubigeo_nac) {
        this.id_ubigeo_nac = id_ubigeo_nac;
    }

    public int getId_ubigeo_act() {
        return id_ubigeo_act;
    }

    public void setId_ubigeo_act(int id_ubigeo_act) {
        this.id_ubigeo_act = id_ubigeo_act;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getDocumento_identidad() {
        return documento_identidad;
    }

    public void setDocumento_identidad(String documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) {
        this.nro_doc = nro_doc;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCorreo_gmail() {
        return correo_gmail;
    }

    public void setCorreo_gmail(String correo_gmail) {
        this.correo_gmail = correo_gmail;
    }

    public String getCorreo_hotmail() {
        return correo_hotmail;
    }

    public void setCorreo_hotmail(String correo_hotmail) {
        this.correo_hotmail = correo_hotmail;
    }

    public String getCorreo_otros() {
        return correo_otros;
    }

    public void setCorreo_otros(String correo_otros) {
        this.correo_otros = correo_otros;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPagina_web() {
        return pagina_web;
    }

    public void setPagina_web(String pagina_web) {
        this.pagina_web = pagina_web;
    }

    public String getFoto_persona() {
        return foto_persona;
    }

    public void setFoto_persona(String foto_persona) {
        this.foto_persona = foto_persona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


  
  
    
}
