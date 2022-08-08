package UD.UnidadDeportivaUD.Servicio;

import UD.UnidadDeportivaUD.Modelo.Empleado;
import UD.UnidadDeportivaUD.Modelo.Empleado_Cargo;
import UD.UnidadDeportivaUD.Repositorio.Empleado_CargoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Empleado_CargoServicio {

    @Autowired
    private Empleado_CargoRepositorio empleado_cargoRepositorio;

    public List<Empleado_Cargo> obtenerTodosEmpleadoCargo(){
        return empleado_cargoRepositorio.findAll();
    }

    //Validación
    public Empleado_Cargo validarAuxiliar(Empleado empleado){

        Empleado_Cargo empleado_cargo = empleado_cargoRepositorio.findByEmpleado(empleado);


        if(empleado_cargo.getCargo().getIDCARGO().equals("1")){
            return empleado_cargo;
        }else{
            return null;
        }

    }


}
