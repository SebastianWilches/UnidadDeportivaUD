package UD.UnidadDeportivaUD.Repositorio;


import UD.UnidadDeportivaUD.Modelo.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepositorio extends JpaRepository<Marca, String> {

}
