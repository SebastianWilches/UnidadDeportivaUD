package UD.UnidadDeportivaUD.Repositorio;


import UD.UnidadDeportivaUD.Modelo.Deporte;
import UD.UnidadDeportivaUD.Modelo.Deporte_Tipoelemento;
import UD.UnidadDeportivaUD.Modelo.ElemenDeportivo;
import UD.UnidadDeportivaUD.Modelo.TipoElemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ElemenDeportivoRepositorio extends JpaRepository<ElemenDeportivo, Long> {

    //Filtrar por tipoElemento
    Optional<ElemenDeportivo> findByTipoElemento(TipoElemento tipoElemento);
}
