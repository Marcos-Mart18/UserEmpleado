package upeu.edu.pe.UserEmpleado.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.edu.pe.UserEmpleado.Dao.UsuarioDao;
import upeu.edu.pe.UserEmpleado.Entity.Usuario;
import upeu.edu.pe.UserEmpleado.Repository.UsuarioRepository;

@Component
public class UsuarioDaoImpl implements UsuarioDao {
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Override
	public Usuario create(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(u);
	}

	@Override
	public Usuario update(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(u);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
	}

	@Override
	public Usuario read(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id).get();
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}
 
}
