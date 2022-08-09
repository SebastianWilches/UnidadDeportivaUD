package UD.UnidadDeportivaUD.Servicio;

import UD.UnidadDeportivaUD.Modelo.Asistirresponsable;
import UD.UnidadDeportivaUD.Repositorio.AsistirresponsableRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsistirresponsableServicio {

    @Autowired
    AsistirresponsableRepositorio asistirresponsableRepositorio;


    public Asistirresponsable guardar(Asistirresponsable asistirResponsable){
        return asistirresponsableRepositorio.save(asistirResponsable);
    }
}
