package UD.UnidadDeportivaUD.Controlador;

import UD.UnidadDeportivaUD.Modelo.*;
import UD.UnidadDeportivaUD.Servicio.*;
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

    @Autowired
    private Deporte_TipoelementoServicio deporte_tipoelementoServicio;

    @Autowired
    private ElemendeportivoServicio elemendeportivoServicio;

    @Autowired
    private EstadoServicio estadoServicio;

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

    @GetMapping("/consultarElementosDeportivos")
    public ResponseEntity<ElemenDeportivo> consultarElementosDeportivos(@RequestParam(name = "nombre") String nombre, @RequestParam(name = "apellido") String apellido){

        //consultar los cursos del docente si este existe
        if(getEmpleadoByNomApellido(nombre, apellido) != null){
            List<Responsable> cursos = responsabelServicio.obtenerCursosPorEmpleado(getEmpleadoByNomApellido(nombre, apellido).getBody());
            Deporte deporte = new Deporte();
            deporte = cursos.get(0).getProgramacion().getDeporte();


            Deporte_Tipoelemento deporte_tipoelemento = new Deporte_Tipoelemento();
            deporte_tipoelemento = deporte_tipoelementoServicio.filtrarPorDeporte(deporte).get();

            ElemenDeportivo elemenDeportivo = new ElemenDeportivo();
            elemenDeportivo = elemendeportivoServicio.filtrarByTipoElemento(deporte_tipoelemento.getTipoElemento()).get();

            return ResponseEntity.ok(elemenDeportivo);
        } else{
            return null;
        }
    }


    @PutMapping("/cambiarEstadoElementosDeportivos/{CONSECELEMENTO}")
    public ResponseEntity<ElemenDeportivo> actualizarEstadoElementoDeportivo(@PathVariable Long CONSECELEMENTO){
        //Obtenemos los elementos deportivos
        ElemenDeportivo elemenDeportivo = elemendeportivoServicio.getElemenDeportivo(CONSECELEMENTO).get();

        //Cambiamos el estado
        Estado estado = elemenDeportivo.getEstado();

        if(estado.getDESCESTADO().equals("1")){
            elemenDeportivo.setEstado(estadoServicio.getEstadoById("2"));
            return ResponseEntity.ok(elemenDeportivo);
        }else{
            elemenDeportivo.setEstado(estadoServicio.getEstadoById("1"));
            return ResponseEntity.ok(elemenDeportivo);
        }
    }



}
