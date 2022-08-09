package UD.UnidadDeportivaUD.Modelo.IDCompuestas;

import UD.UnidadDeportivaUD.Modelo.Asistirresponsable;
import UD.UnidadDeportivaUD.Modelo.Programacion;
import UD.UnidadDeportivaUD.Modelo.Responsable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class AsistirResponsableID implements Serializable {

    private AsistirResponsableFK asistirResponsableFK;
    private Long CONSECASISRES;

}
