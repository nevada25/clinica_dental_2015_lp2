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
public class Historia_clinica {

    private int id_historia_clinica;
    private int id_cliente;
    private String nro_historia;
    private String comentario;
    private String antecedentes_familiar;
    private String fecha_reg;
    private String hora_reg;
    private String responsable_apoderado;
    private String motivo_consulta;
    private double peso;
    private double talla;
    private String pa;
    private String estado;

    public Historia_clinica() {
    }

    public int getId_historia_clinica() {
        return id_historia_clinica;
    }

    public void setId_historia_clinica(int id_historia_clinica) {
        this.id_historia_clinica = id_historia_clinica;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNro_historia() {
        return nro_historia;
    }

    public void setNro_historia(String nro_historia) {
        this.nro_historia = nro_historia;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getAntecedentes_familiar() {
        return antecedentes_familiar;
    }

    public void setAntecedentes_familiar(String antecedentes_familiar) {
        this.antecedentes_familiar = antecedentes_familiar;
    }

    public String getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(String fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public String getHora_reg() {
        return hora_reg;
    }

    public void setHora_reg(String hora_reg) {
        this.hora_reg = hora_reg;
    }

    public String getResponsable_apoderado() {
        return responsable_apoderado;
    }

    public void setResponsable_apoderado(String responsable_apoderado) {
        this.responsable_apoderado = responsable_apoderado;
    }

    public String getMotivo_consulta() {
        return motivo_consulta;
    }

    public void setMotivo_consulta(String motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
