package UD.UnidadDeportivaUD.Controlador;

import UD.UnidadDeportivaUD.Modelo.Empleado;
import UD.UnidadDeportivaUD.Servicio.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Auxiliar")
public class AuxiliarControlador {

    @Autowired
    private EmpleadoServicio empleadoServicio;


    @GetMapping("/getAsistenciaDocente")
    public ResponseEntity<Empleado> getEmpleadoByNomApellido(@RequestParam(name="nombre") String nombre, @RequestParam(name="apellido") String apellido){

        if(empleadoServicio.getDocenteByNomApell(nombre, apellido).size()>0){
            return ResponseEntity.ok(empleadoServicio.getDocenteByNomApell(nombre, apellido).get(0));
        }else{
            return null;
        }

    }
}
