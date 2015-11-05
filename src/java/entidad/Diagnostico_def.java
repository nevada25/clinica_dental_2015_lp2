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
public class Diagnostico_def {

    private int id_diagnostico_def;
    private String cie_10;
    private String descripcion;

    public Diagnostico_def() {
    }

    public int getId_diagnostico_def() {
        return id_diagnostico_def;
    }

    public void setId_diagnostico_def(int id_diagnostico_def) {
        this.id_diagnostico_def = id_diagnostico_def;
    }

    public String getCie_10() {
        return cie_10;
    }

    public void setCie_10(String cie_10) {
        this.cie_10 = cie_10;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
