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
public class Grado_instruccion {

    private int id_grado_instruccion;
    private String nombre_grad_inst;
    private String estado;

    public Grado_instruccion() {
    }

    public int getId_grado_instruccion() {
        return id_grado_instruccion;
    }

    public void setId_grado_instruccion(int id_grado_instruccion) {
        this.id_grado_instruccion = id_grado_instruccion;
    }

    public String getNombre_grad_inst() {
        return nombre_grad_inst;
    }

    public void setNombre_grad_inst(String nombre_grad_inst) {
        this.nombre_grad_inst = nombre_grad_inst;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
