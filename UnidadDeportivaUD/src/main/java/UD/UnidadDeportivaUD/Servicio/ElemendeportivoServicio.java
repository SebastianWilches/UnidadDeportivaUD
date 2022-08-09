package UD.UnidadDeportivaUD.Servicio;

import UD.UnidadDeportivaUD.Modelo.ElemenDeportivo;
import UD.UnidadDeportivaUD.Modelo.TipoElemento;
import UD.UnidadDeportivaUD.Repositorio.ElemenDeportivoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ElemendeportivoServicio {

    @Autowired
    private ElemenDeportivoRepositorio elemenDeportivoRepositorio;

    public Optional<ElemenDeportivo> filtrarByTipoElemento(TipoElemento tipoElemento){

        if(!elemenDeportivoRepositorio.findByTipoElemento(tipoElemento).isEmpty()){
            return elemenDeportivoRepositorio.findByTipoElemento(tipoElemento);
        }else {
            return null;
        }
    }


    public Optional<ElemenDeportivo> getElemenDeportivo(Long CONSECELEMENTO){
        return elemenDeportivoRepositorio.findById(CONSECELEMENTO);
    }
}
