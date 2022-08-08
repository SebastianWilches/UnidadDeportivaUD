package UD.UnidadDeportivaUD.Repositorio;


import UD.UnidadDeportivaUD.Modelo.Espacio_Deporte;
import UD.UnidadDeportivaUD.Modelo.IDCompuestas.Espacio_DeporteID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Espacio_DeporteRepositorio extends JpaRepository<Espacio_Deporte, Espacio_DeporteID> {
}
