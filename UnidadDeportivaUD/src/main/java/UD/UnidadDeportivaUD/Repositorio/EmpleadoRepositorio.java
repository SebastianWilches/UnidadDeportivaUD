package UD.UnidadDeportivaUD.Repositorio;


import UD.UnidadDeportivaUD.Modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, String> {

    //Filtros
    List<Empleado> findByNOMEMPLEADO(String NOMEMPLEADO);
    Empleado findByAPELLEMPLEADO(String APELLEMPLEADO);
}
