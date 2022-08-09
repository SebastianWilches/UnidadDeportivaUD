package UD.UnidadDeportivaUD.Repositorio;

import UD.UnidadDeportivaUD.Modelo.Asistirresponsable;
import UD.UnidadDeportivaUD.Modelo.IDCompuestas.AsistirResponsableID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsistirresponsableRepositorio extends JpaRepository<Asistirresponsable, AsistirResponsableID> {

}
