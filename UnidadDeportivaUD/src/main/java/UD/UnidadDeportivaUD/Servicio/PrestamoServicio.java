package UD.UnidadDeportivaUD.Servicio;

import UD.UnidadDeportivaUD.Modelo.Prestamo;
import UD.UnidadDeportivaUD.Repositorio.PrestamoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestamoServicio {

    @Autowired
    PrestamoRepositorio prestamoRepositorio;

    public Prestamo guardar(Prestamo prestamo){
        return prestamoRepositorio.save(prestamo);
    }
}
