package UD.UnidadDeportivaUD.Repositorio;

import UD.UnidadDeportivaUD.Modelo.Deporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeporteRepositorio extends JpaRepository<Deporte, String> {
}
