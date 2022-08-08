package UD.UnidadDeportivaUD.Servicio;

import UD.UnidadDeportivaUD.Modelo.Deporte;
import UD.UnidadDeportivaUD.Modelo.Deporte_Tipoelemento;
import UD.UnidadDeportivaUD.Repositorio.Deporte_TipoelementoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Deporte_TipoelementoServicio {

    @Autowired
    private Deporte_TipoelementoRepositorio deporte_tipoelementoRepositorio;

    public Optional<Deporte_Tipoelemento> filtrarPorDeporte(Deporte deporte){

        if(!deporte_tipoelementoRepositorio.findByDeporte(deporte).isEmpty()){
            return deporte_tipoelementoRepositorio.findByDeporte(deporte);
        }else{
            return null;
        }
    }
}
