package UD.UnidadDeportivaUD.Servicio;

import UD.UnidadDeportivaUD.Modelo.Empleado;
import UD.UnidadDeportivaUD.Modelo.Responsable;
import UD.UnidadDeportivaUD.Repositorio.ResponsableRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsabelServicio {

    @Autowired
    private ResponsableRepositorio responsableRepositorio;

    public List<Responsable> obtenerResponsables(){
        return responsableRepositorio.findAll();
    }

    //obtiene los cursos de cada empleado de la tabla responsable
    //Cursos a cargo incluye el pasante, docente a cargo, programacion(FALTA CONSULTAR EL espacio de este curso(elementos deportivos, estado), deporte, periodo, actividad, horas, fecha), deporte
    //falta validar las fechas
    public List<Responsable> obtenerCursosPorEmpleado(Empleado empleado){

        List<Responsable>  cursosACargo = responsableRepositorio.findByEmpleado(empleado);

        if(cursosACargo.size() > 0){
            return cursosACargo;
        }else{
            return null;
        }

    }
}
