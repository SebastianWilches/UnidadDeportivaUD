package UD.UnidadDeportivaUD.Repositorio;


import UD.UnidadDeportivaUD.Modelo.Hora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoraRepositorio extends JpaRepository<Hora, String> {

}
