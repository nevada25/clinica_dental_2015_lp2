/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimpl;

import conexion.conexionpostgres;
import dao.usuariodao;
import entidad.Persona;
import entidad.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NEVADA
 */
public class usuariodaoimpl implements usuariodao{
public Connection conectar(){
Connection cn=conexionpostgres.conectar();

return cn;
}
public void guardar(){
    try {
        conectar().commit();
    } catch (Exception e) {
    }

}
public void cerrar(){
    try {
        conectar().close();
    } catch (Exception e) {
    }

}
public void restaurar(){
    try {
        conectar().rollback();
    } catch (Exception e) {
    }

}
    
    
    @Override
    public boolean agregarusuario(Usuario usuario) {
        boolean estado=false;
        Statement st=null;
        String query="INSERT INTO usuario(idusuario, usuario, contrasena)VALUES (null,'"+usuario.getUsuario()+"','"+usuario.getContrasena()+"')";
        try {
            st=conectar().createStatement();
            st.executeUpdate(query);
            guardar();
            cerrar();
            estado=true;
        } catch (Exception e) {
            System.out.println("ERROR:"+e.getMessage());
            restaurar();
            cerrar();
            estado=false;
        }
        
        return estado;
    }

    @Override
    public List<Usuario> mostrarusuario() {
        List<Usuario> lista=null;
        Statement st=null;
        Usuario user=null;
        ResultSet rs=null;
        String query="SELECT idusuario, usuario, contrasena FROM usuario";
        try {
            st=conectar().createStatement();
            st.executeQuery(query);
            lista= new ArrayList<>();
            while (rs.next()) {                
                user=new Usuario();
                user.setIdusuario(rs.getInt("idusuario"));
                user.setUsuario(rs.getString("usuario"));
               user.setContrasena(rs.getString("contrasena"));
                
            }
            cerrar();
            
        } catch (Exception e) {
            System.out.println("ERROR:"+e.getMessage());
            
        }
        
        return lista;
                
    }

    @Override
    public boolean actualizarusuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarusuario(int id_usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario Validarusuario(String user, String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
