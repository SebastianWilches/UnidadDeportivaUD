package UD.UnidadDeportivaUD.Controlador;

import UD.UnidadDeportivaUD.Modelo.Empleado_Cargo;
import UD.UnidadDeportivaUD.Servicio.Empleado_CargoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/EmpleadoCargo")
public class Empleado_CargoControlador {

    @Autowired
    private Empleado_CargoServicio empleado_cargoService;

    @GetMapping("/getEmpleadoCargo")
    public ResponseEntity<List<Empleado_Cargo>> getEmpleadoCargo(){
        return ResponseEntity.ok(empleado_cargoService.obtenerTodosEmpleadoCargo());
    }


}
