package UD.UnidadDeportivaUD.Controlador;

import UD.UnidadDeportivaUD.Modelo.Deporte;
import UD.UnidadDeportivaUD.Servicio.DeporteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/deporte")
public class DeporteControlador {

    @Autowired
    private DeporteServicio deporteServicio;

    @GetMapping("/getDeportes")
    public ResponseEntity<List<Deporte>> getDeportes(){
        return ResponseEntity.ok(deporteServicio.getDeportes());
    }
}
