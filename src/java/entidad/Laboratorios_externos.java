/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Luis Lavado
 */
public class Laboratorios_externos {

    private int id_lab_externo;
    private String nombre_lab_ext;
    private String descripcion;
    private String estado;

    public Laboratorios_externos() {
    }

    public int getId_lab_externo() {
        return id_lab_externo;
    }

    public void setId_lab_externo(int id_lab_externo) {
        this.id_lab_externo = id_lab_externo;
    }

    public String getNombre_lab_ext() {
        return nombre_lab_ext;
    }

    public void setNombre_lab_ext(String nombre_lab_ext) {
        this.nombre_lab_ext = nombre_lab_ext;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
