package upeu.edu.pe.UserEmpleado.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.UserEmpleado.Entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}
