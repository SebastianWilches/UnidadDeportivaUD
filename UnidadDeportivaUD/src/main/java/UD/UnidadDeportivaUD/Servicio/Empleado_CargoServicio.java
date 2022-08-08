package UD.UnidadDeportivaUD.Servicio;

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

    public Empleado_Cargo getEmpleado_CargoTest(Long id){
        return empleado_cargoRepositorio.findById(id).get();
    }
}
