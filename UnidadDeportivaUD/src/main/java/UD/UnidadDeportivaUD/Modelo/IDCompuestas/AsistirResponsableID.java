package UD.UnidadDeportivaUD.Modelo.IDCompuestas;

import UD.UnidadDeportivaUD.Modelo.Asistirresponsable;
import UD.UnidadDeportivaUD.Modelo.Programacion;
import UD.UnidadDeportivaUD.Modelo.Responsable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class AsistirResponsableID implements Serializable {

    /*@EmbeddedId
    private AsistirResponsableFK asistirResponsableFK;*/
    private Programacion programacion;
    private Responsable responsable;
    private Long asistirresponsable;

}
