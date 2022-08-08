package UD.UnidadDeportivaUD.Repositorio;


import UD.UnidadDeportivaUD.Modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, String> {
}
