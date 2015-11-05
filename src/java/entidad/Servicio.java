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
public class Servicio {

    private int id_servicio;
    private int id_cat_serv;
    private String nombre_serv;
    private double precio_max;
    private double precio_min;
    private String estado;

    public Servicio() {
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getId_cat_serv() {
        return id_cat_serv;
    }

    public void setId_cat_serv(int id_cat_serv) {
        this.id_cat_serv = id_cat_serv;
    }

    public String getNombre_serv() {
        return nombre_serv;
    }

    public void setNombre_serv(String nombre_serv) {
        this.nombre_serv = nombre_serv;
    }

    public double getPrecio_max() {
        return precio_max;
    }

    public void setPrecio_max(double precio_max) {
        this.precio_max = precio_max;
    }

    public double getPrecio_min() {
        return precio_min;
    }

    public void setPrecio_min(double precio_min) {
        this.precio_min = precio_min;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
