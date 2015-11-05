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
public class Unidad_medida {

    private int id_unidad_medida;
    private String nombre_uni_med;
    private String estado;

    public Unidad_medida() {
    }

    public int getId_unidad_medida() {
        return id_unidad_medida;
    }

    public void setId_unidad_medida(int id_unidad_medida) {
        this.id_unidad_medida = id_unidad_medida;
    }

    public String getNombre_uni_med() {
        return nombre_uni_med;
    }

    public void setNombre_uni_med(String nombre_uni_med) {
        this.nombre_uni_med = nombre_uni_med;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
