package UD.UnidadDeportivaUD.Modelo.IDCompuestas;

import UD.UnidadDeportivaUD.Modelo.Deporte;
import UD.UnidadDeportivaUD.Modelo.Espacio;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
public class Espacio_DeporteID implements Serializable {

    private Deporte IDDEPORTE_FKESPACIO_DEPORTE;
    private Espacio CODESPACIO_FKESPACIO_DEPORTE;


}
