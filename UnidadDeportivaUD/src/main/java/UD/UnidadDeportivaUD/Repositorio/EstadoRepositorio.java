package UD.UnidadDeportivaUD.Repositorio;

import UD.UnidadDeportivaUD.Modelo.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepositorio extends JpaRepository<Estado, String> {
}
