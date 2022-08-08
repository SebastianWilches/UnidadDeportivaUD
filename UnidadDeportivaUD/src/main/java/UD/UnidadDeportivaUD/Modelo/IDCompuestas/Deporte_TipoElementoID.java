package UD.UnidadDeportivaUD.Modelo.IDCompuestas;


import UD.UnidadDeportivaUD.Modelo.Deporte;
import UD.UnidadDeportivaUD.Modelo.TipoElemento;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class Deporte_TipoElementoID implements Serializable {

    private TipoElemento tipoElemento;
    private Deporte deporte;


}
