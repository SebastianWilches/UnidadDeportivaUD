package UD.UnidadDeportivaUD.Repositorio;


import UD.UnidadDeportivaUD.Modelo.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoRepositorio extends JpaRepository<Periodo, String> {
}
