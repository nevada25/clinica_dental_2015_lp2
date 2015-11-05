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
public class Diagnostico_pre {

    private int id_diagnostico_pre;
    private String descripcion;
    private int id_historia_clinica;

    public Diagnostico_pre() {
    }

    public int getId_diagnostico_pre() {
        return id_diagnostico_pre;
    }

    public void setId_diagnostico_pre(int id_diagnostico_pre) {
        this.id_diagnostico_pre = id_diagnostico_pre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_historia_clinica() {
        return id_historia_clinica;
    }

    public void setId_historia_clinica(int id_historia_clinica) {
        this.id_historia_clinica = id_historia_clinica;
    }
    
}
