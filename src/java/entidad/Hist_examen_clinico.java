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
public class Hist_examen_clinico {

    private int id_historia_clinica;
    private int id_examen_clinico;
    private String descripcion;
    private String estado;

    public Hist_examen_clinico() {
    }

    public int getId_historia_clinica() {
        return id_historia_clinica;
    }

    public void setId_historia_clinica(int id_historia_clinica) {
        this.id_historia_clinica = id_historia_clinica;
    }

    public int getId_examen_clinico() {
        return id_examen_clinico;
    }

    public void setId_examen_clinico(int id_examen_clinico) {
        this.id_examen_clinico = id_examen_clinico;
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
