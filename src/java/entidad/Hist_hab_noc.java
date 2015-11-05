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
public class Hist_hab_noc {

    private int id_historia_clinica;
    private int id_habito_nocivo;
    private String estado;

    public Hist_hab_noc() {
    }

    public int getId_historia_clinica() {
        return id_historia_clinica;
    }

    public void setId_historia_clinica(int id_historia_clinica) {
        this.id_historia_clinica = id_historia_clinica;
    }

    public int getId_habito_nocivo() {
        return id_habito_nocivo;
    }

    public void setId_habito_nocivo(int id_habito_nocivo) {
        this.id_habito_nocivo = id_habito_nocivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
