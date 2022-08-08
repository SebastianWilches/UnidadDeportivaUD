package UD.UnidadDeportivaUD.Controlador;

import UD.UnidadDeportivaUD.Modelo.Empleado;
import UD.UnidadDeportivaUD.Modelo.Empleado_Cargo;
import UD.UnidadDeportivaUD.Modelo.Responsable;
import UD.UnidadDeportivaUD.Servicio.EmpleadoServicio;
import UD.UnidadDeportivaUD.Servicio.Empleado_CargoServicio;
import UD.UnidadDeportivaUD.Servicio.ResponsabelServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Auxiliar")
public class AuxiliarControlador {

    @Autowired
    private EmpleadoServicio empleadoServicio;

    @Autowired
    private Empleado_CargoServicio empleado_cargoServicio;

    @Autowired
    private ResponsabelServicio responsabelServicio;

    @GetMapping("/validarAuxiliar/{CODEMPLEADO}")
    public ResponseEntity<Empleado_Cargo> isAuxiliar(@PathVariable String CODEMPLEADO) {

        if (!empleadoServicio.getEmpleado(CODEMPLEADO).isEmpty()) {
            return ResponseEntity.ok(empleado_cargoServicio.validarAuxiliar(empleadoServicio.getEmpleado(CODEMPLEADO).get()));
        }else{
            return null;
        }
    }

    @GetMapping("/getAsistenciaDocente")
    public ResponseEntity<Empleado> getEmpleadoByNomApellido(@RequestParam(name="nombre") String nombre, @RequestParam(name="apellido") String apellido){

        if(empleadoServicio.getDocenteByNomApell(nombre, apellido).size()>0){
            return ResponseEntity.ok(empleadoServicio.getDocenteByNomApell(nombre, apellido).get(0));
        }else{
            return null;
        }

    }


    @GetMapping("/consultarCursosPorDocente")
    public ResponseEntity<List<Responsable>> consultarCursosPorDocente(@RequestParam(name = "nombre") String nombre, @RequestParam(name = "apellido") String apellido){

        //consultar los cursos del docente si este existe
        if(getEmpleadoByNomApellido(nombre, apellido) != null){
            //System.out.println(getEmpleadoByNombreApellido(nombre, apellido).getBody());
            return ResponseEntity.ok(responsabelServicio.obtenerCursosPorEmpleado(getEmpleadoByNomApellido(nombre, apellido).getBody()));
        } else{
            return null;
        }

    }


}
