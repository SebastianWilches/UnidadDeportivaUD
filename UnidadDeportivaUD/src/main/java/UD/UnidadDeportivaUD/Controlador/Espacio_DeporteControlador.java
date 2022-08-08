package UD.UnidadDeportivaUD.Controlador;

import UD.UnidadDeportivaUD.Modelo.Espacio_Deporte;
import UD.UnidadDeportivaUD.Servicio.Espacio_DeporteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/EspacioDeporte")
public class Espacio_DeporteControlador {

    @Autowired
    private Espacio_DeporteServicio espacio_deporteServicio;

    @RequestMapping("/getEspacioDeporte")
    public ResponseEntity<List<Espacio_Deporte>> getEspacio_Deporte(){
        return ResponseEntity.ok(espacio_deporteServicio.getEspacio_Deporte());
    }
}
