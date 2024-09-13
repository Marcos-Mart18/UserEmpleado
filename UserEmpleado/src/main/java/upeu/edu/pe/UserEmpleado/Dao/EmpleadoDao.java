package upeu.edu.pe.UserEmpleado.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import upeu.edu.pe.UserEmpleado.Entity.Empleado;


@Component
public interface EmpleadoDao {
	Empleado create(Empleado em);
	Empleado update(Empleado em);
	void delete(Long id);
	Empleado read(Long id);
	List<Empleado>readAll();
}
