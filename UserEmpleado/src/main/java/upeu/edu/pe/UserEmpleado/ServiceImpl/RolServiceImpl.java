package upeu.edu.pe.UserEmpleado.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.UserEmpleado.Dao.RolDao;
import upeu.edu.pe.UserEmpleado.Entity.Rol;
import upeu.edu.pe.UserEmpleado.Service.RolService;


@Service
public class RolServiceImpl implements RolService {
	@Autowired
	private RolDao rolDao;
	@Override
	public Rol create(Rol r) {
		// TODO Auto-generated method stub
		return rolDao.create(r);
	}

	@Override
	public Rol update(Rol r) {
		// TODO Auto-generated method stub
		return rolDao.update(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolDao.delete(id);
	}

	@Override
	public Rol read(Long id) {
		// TODO Auto-generated method stub
		return rolDao.read(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolDao.readAll();
	}

}
