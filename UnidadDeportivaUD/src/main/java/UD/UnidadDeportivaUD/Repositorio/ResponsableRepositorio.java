package UD.UnidadDeportivaUD.Repositorio;

import UD.UnidadDeportivaUD.Modelo.Empleado;
import UD.UnidadDeportivaUD.Modelo.IDCompuestas.ResponsableID;
import UD.UnidadDeportivaUD.Modelo.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResponsableRepositorio extends JpaRepository<Responsable, ResponsableID> {

    List<Responsable> findByEmpleado(Empleado empleado);

}
