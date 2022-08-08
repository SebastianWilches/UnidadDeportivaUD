package UD.UnidadDeportivaUD.Repositorio;

import UD.UnidadDeportivaUD.Modelo.Deporte;
import UD.UnidadDeportivaUD.Modelo.Deporte_Tipoelemento;
import UD.UnidadDeportivaUD.Modelo.IDCompuestas.Deporte_TipoElementoID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Deporte_TipoelementoRepositorio extends JpaRepository<Deporte_Tipoelemento, Deporte_TipoElementoID> {

    //Filtrar por deporte
    Optional<Deporte_Tipoelemento> findByDeporte(Deporte deporte);
}
