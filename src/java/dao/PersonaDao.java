
package dao;

import entidad.Persona;
import java.util.List;

public interface PersonaDao {
public boolean  agregarpersona(Persona persona);
public List<Persona> mostrarpersona();
public boolean  actualizarpersona(Persona persona);
public boolean  eliminarpersona(int id);
}
