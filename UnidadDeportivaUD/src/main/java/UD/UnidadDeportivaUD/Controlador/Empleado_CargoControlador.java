package UD.UnidadDeportivaUD.Controlador;

import UD.UnidadDeportivaUD.Modelo.Empleado;
import UD.UnidadDeportivaUD.Modelo.Empleado_Cargo;
import UD.UnidadDeportivaUD.Servicio.EmpleadoServicio;
import UD.UnidadDeportivaUD.Servicio.Empleado_CargoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/EmpleadoCargo")
public class Empleado_CargoControlador {

    @Autowired
    private Empleado_CargoServicio empleado_cargoService;

    @Autowired
    private EmpleadoServicio empleadoServicio;

    @GetMapping("/getEmpleadoCargo")
    public ResponseEntity<List<Empleado_Cargo>> getEmpleadoCargo(){
        return ResponseEntity.ok(empleado_cargoService.obtenerTodosEmpleadoCargo());
    }

    @GetMapping("/validarAuxiliar/{CODEMPLEADO}")
    public ResponseEntity<Empleado_Cargo> isAuxiliar(@PathVariable String CODEMPLEADO) {

        if (!empleadoServicio.getEmpleado(CODEMPLEADO).isEmpty()) {
            return ResponseEntity.ok(empleado_cargoService.validarAuxiliar(empleadoServicio.getEmpleado(CODEMPLEADO).get()));
        }else{
            return null;
        }
    }



}
