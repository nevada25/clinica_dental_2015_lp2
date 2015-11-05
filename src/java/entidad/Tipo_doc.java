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
public class Tipo_doc {

    private int id_tipo_doc;
    private String nombre_tipo_doc;
    private String estado;

    public Tipo_doc() {
    }

    public int getId_tipo_doc() {
        return id_tipo_doc;
    }

    public void setId_tipo_doc(int id_tipo_doc) {
        this.id_tipo_doc = id_tipo_doc;
    }

    public String getNombre_tipo_doc() {
        return nombre_tipo_doc;
    }

    public void setNombre_tipo_doc(String nombre_tipo_doc) {
        this.nombre_tipo_doc = nombre_tipo_doc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
