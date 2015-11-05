/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimpl;

import conexion.conexionpostgres;
import dao.PersonaDao;
import entidad.Persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NEVADA
 */
public class PersonaDaoImpl implements PersonaDao{
public  Connection conexion(){

Connection cn=conexionpostgres.conectar();

return  cn;
}
public void restaurar(){
    try {
        conexion().rollback();
    } catch (Exception e) {
    }
}
public void guardar(){
    try {
        conexion().commit();
    } catch (Exception e) {
    }
}
public void cerrar(){
    try {
        conexion().close();
    } catch (Exception e) {
    }
}



    @Override
    public boolean agregarpersona(Persona persona) {
  boolean estado=false;
        Statement st=null;
        String query="INSERT INTO persona VALUES ("+persona.getId_persona()+","+persona.getId_grado_instruccion()+","+persona.getId_ocupacion()+","+persona.getId_ubigeo_nac()+","+persona.getId_ubigeo_act()+",'"+persona.getNombre()+"','"+persona.getNombres()+"','"+persona.getApepat()+"','"+persona.getApemat()+"','"+persona.getFecha_nac()+"','"+persona.getDocumento_identidad()+"',"
                + "'"+persona.getNro_doc()+"','"+persona.getRuc()+"','"+persona.getCorreo_gmail()+"','"+persona.getCorreo_hotmail()+"','"+persona.getCorreo_otros()+"','"+persona.getCelular()+"','"+persona.getTelefono()+"','"+persona.getSexo()+"','"+persona.getDireccion()+"','"+persona.getPagina_web()+"','"+persona.getFoto_persona()+"','"+persona.getEstado()+"')";
        try {
            st=conexion().createStatement();
            st.executeUpdate(query);
            guardar();
            cerrar();
            estado=true;
        } catch (Exception e) {
            System.out.println("ERROR:"+e.getMessage());
            restaurar();
            cerrar();
            estado=false;
        }finally{
            if (conexion()!=null) {
                restaurar();
                cerrar();
                
            }
        
        }
     
  return estado;
    }

    @Override
    public List<Persona> mostrarpersona() {
       List<Persona> lista=null;
        Statement st=null;
        ResultSet rs=null;
        Persona persona=null;
        String query="";
        try {
            lista=new ArrayList<>();
            st=conexion().createStatement();
            st.executeQuery(query);
            while (rs.next()) {
              persona=new Persona();
                 persona.setId_persona(rs.getInt("id_Persona"));
                 persona.setId_grado_instruccion(rs.getInt("gradoInstruccion"));
                 persona.getId_ocupacion();
                 persona.getId_ubigeo_nac();
                 persona.getId_ubigeo_act();
                 persona.getNombre();
                 persona.getNombres();
                 persona.getApepat();
                 persona.getApemat();
                 persona.getFecha_nac();
                 persona.getDocumento_identidad();
                 persona.getNro_doc();
                 persona.getRuc();
                 persona.getCorreo_gmail();
                 persona.getCorreo_hotmail();
                 persona.getCorreo_otros();
                 persona.getCelular();
                 persona.getTelefono();
                 persona.getSexo();
                 persona.getDireccion();
                 persona.getPagina_web();
                 persona.getFoto_persona();
                persona.getEstado();
                lista.add(persona);
                
            }
        } catch (Exception e) {
        }
       
       return lista;
    }

    @Override
    public boolean actualizarpersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarpersona(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
