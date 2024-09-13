package upeu.edu.pe.UserEmpleado.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.edu.pe.UserEmpleado.Dao.EmpleadoDao;
import upeu.edu.pe.UserEmpleado.Entity.Empleado;
import upeu.edu.pe.UserEmpleado.Repository.EmpleadoRepository;


@Component
public class EmpeladoDaoImpl implements EmpleadoDao {
	@Autowired
	private EmpleadoRepository empleadoRepository;
	@Override
	public Empleado create(Empleado em) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(em);
	}

	@Override
	public Empleado update(Empleado em) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(em);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadoRepository.deleteById(id);
	}

	@Override
	public Empleado read(Long id) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(id).get();
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

}
