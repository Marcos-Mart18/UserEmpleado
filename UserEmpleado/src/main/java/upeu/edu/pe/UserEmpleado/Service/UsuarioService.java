package upeu.edu.pe.UserEmpleado.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import upeu.edu.pe.UserEmpleado.Entity.Usuario;

@Service
public interface UsuarioService {
	Usuario create(Usuario u);
	Usuario update(Usuario u);
	void delete(Long id);
	Usuario read(Long id);
	List<Usuario>readAll();
}
