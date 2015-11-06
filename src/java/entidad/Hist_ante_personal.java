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
public class Hist_ante_personal {

    private int id_historia_clinica;
    private int id_ante_personal;
    private String estado;

    public Hist_ante_personal() {
    }

    public int getId_historia_clinica() {
        return id_historia_clinica;
    }

    public void setId_historia_clinica(int id_historia_clinica) {
        this.id_historia_clinica = id_historia_clinica;
    }

    public int getId_ante_personal() {
        return id_ante_personal;
    }

    public void setId_ante_personal(int id_ante_personal) {
        this.id_ante_personal = id_ante_personal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
