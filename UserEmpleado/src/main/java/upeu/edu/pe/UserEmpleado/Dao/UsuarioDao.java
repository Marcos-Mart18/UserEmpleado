package upeu.edu.pe.UserEmpleado.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import upeu.edu.pe.UserEmpleado.Entity.Usuario;


@Component
public interface UsuarioDao {
	Usuario create(Usuario u);
	Usuario update(Usuario u);
	void delete(Long id);
	Usuario read(Long id);
	List<Usuario>readAll();
}
