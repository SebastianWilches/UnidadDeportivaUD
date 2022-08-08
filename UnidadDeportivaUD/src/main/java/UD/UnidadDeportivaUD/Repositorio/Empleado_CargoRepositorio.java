package UD.UnidadDeportivaUD.Repositorio;

import UD.UnidadDeportivaUD.Modelo.Empleado;
import UD.UnidadDeportivaUD.Modelo.Empleado_Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Empleado_CargoRepositorio extends JpaRepository<Empleado_Cargo, Long> {



    //Filtrar por llave del empleado
    public Empleado_Cargo findByEmpleado(Empleado empleado);
}
