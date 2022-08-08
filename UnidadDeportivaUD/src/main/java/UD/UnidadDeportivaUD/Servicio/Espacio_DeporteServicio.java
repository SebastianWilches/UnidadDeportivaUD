package UD.UnidadDeportivaUD.Servicio;

import UD.UnidadDeportivaUD.Modelo.Espacio_Deporte;
import UD.UnidadDeportivaUD.Repositorio.Espacio_DeporteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Espacio_DeporteServicio {

    @Autowired
    private Espacio_DeporteRepositorio espacio_deporteRepositorio;

    public List<Espacio_Deporte> getEspacio_Deporte(){
        return espacio_deporteRepositorio.findAll();
    }
}
