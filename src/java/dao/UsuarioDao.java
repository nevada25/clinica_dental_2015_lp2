/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import entidad.Usuario;
import java.util.List;

/**
 *
 * @author NEVADA
 */
public interface UsuarioDao {
    public boolean  agregarusuario(Usuario usuario);
    public List<Usuario> mostrarusuario();
    public boolean actualizarusuario(Usuario usuario);
    public boolean eliminarusuario(int id_usuario);
    public Usuario Validarusuario(String usuario,String contrasena);
    
}
