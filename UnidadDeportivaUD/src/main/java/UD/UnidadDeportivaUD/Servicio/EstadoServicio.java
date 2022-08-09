package UD.UnidadDeportivaUD.Servicio;

import UD.UnidadDeportivaUD.Modelo.Estado;
import UD.UnidadDeportivaUD.Repositorio.EstadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoServicio {

    @Autowired
    private EstadoRepositorio estadoRepositorio;

    public Estado getEstadoById(String IDESTADO){
        return estadoRepositorio.findById(IDESTADO).get();
    }
}
