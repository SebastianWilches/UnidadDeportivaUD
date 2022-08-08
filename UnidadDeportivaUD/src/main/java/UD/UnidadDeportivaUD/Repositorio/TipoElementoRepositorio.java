package UD.UnidadDeportivaUD.Repositorio;

import UD.UnidadDeportivaUD.Modelo.TipoElemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoElementoRepositorio extends JpaRepository<TipoElemento, String> {

}
