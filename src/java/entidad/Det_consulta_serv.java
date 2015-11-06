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
public class Det_consulta_serv {

    private int id_servicio;
    private int id_cita;
    private double cantidad;
    private double total;
    private String nro_laboratorio_int;
    private String motivo_consul;
    private int id_empleado;

    public Det_consulta_serv() {
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNro_laboratorio_int() {
        return nro_laboratorio_int;
    }

    public void setNro_laboratorio_int(String nro_laboratorio_int) {
        this.nro_laboratorio_int = nro_laboratorio_int;
    }

    public String getMotivo_consul() {
        return motivo_consul;
    }

    public void setMotivo_consul(String motivo_consul) {
        this.motivo_consul = motivo_consul;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }
    
    
}
