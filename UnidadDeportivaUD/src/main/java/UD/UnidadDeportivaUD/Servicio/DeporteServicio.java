package UD.UnidadDeportivaUD.Servicio;

import UD.UnidadDeportivaUD.Modelo.Deporte;
import UD.UnidadDeportivaUD.Repositorio.DeporteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeporteServicio {

    @Autowired
    private DeporteRepositorio deporteRepositorio;

    public List<Deporte> getDeportes(){
        return deporteRepositorio.findAll();
    }
}
